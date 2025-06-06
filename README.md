# Sistema de Gestión Hospitalaria (NetTEAM)

Este proyecto es un sistema de gestión hospitalaria desarrollado con Spring Boot, diseñado para manejar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para diversas entidades clave dentro de un entorno hospitalario. Ofrece una API RESTful para la interacción con los datos, siguiendo una arquitectura por capas para una mejor organización y mantenimiento del código.

---

## Tecnologías Utilizadas

* **Java 17**: Lenguaje de programación principal.
* **Spring Boot**: Framework para la creación de aplicaciones Java empresariales robustas.
* **Spring Data JPA**: Abstracción para simplificar el acceso a datos y la interacción con bases de datos relacionales.
* **Hibernate**: Implementación de JPA para el mapeo objeto-relacional.
* **Maven**: Herramienta de gestión de proyectos y construcción.
* **MySQL**: Base de datos relacional utilizada para el almacenamiento de datos.
* **Postman**: Herramienta utilizada para probar los endpoints de la API REST.
* **Git & GitHub**: Para control de versiones y colaboración en el código.

---

## Características Principales

* **Operaciones CRUD Completas**: Permite gestionar entidades hospitalarias como:
    * **Pacientes**
    * **Médicos**
    * **Citas Médicas**
    * (Si tienes otras entidades, puedes listarlas aquí, ej. Departamentos, Especialidades, etc.)
* **Arquitectura por Capas**: El proyecto sigue una estructura limpia con las capas `Model`, `Repository`, `Service`, `ServiceImpl` y `Controller`, promoviendo la modularidad y la separación de responsabilidades.
* **API RESTful**: Exposición de endpoints REST para la interacción con el sistema.
* **Manejo de Errores**: Respuestas HTTP adecuadas para errores (ej. `400 Bad Request`, `404 Not Found`).
* **Persistencia de Datos**: Integración con MySQL para el almacenamiento de información.
* **Mapeo de Relaciones JPA**: Uso adecuado de anotaciones como `@OneToMany`, `@ManyToOne` para definir las relaciones entre entidades.
* **Control de Versiones**: Gestión del código fuente usando Git, con la rama `develop` como principal para el desarrollo.

---

## Cómo Instalar y Ejecutar el Proyecto

1.  **Clonar el Repositorio**:
    ```bash
    git clone [https://github.com/DayanaG11/Prueba.git](https://github.com/DayanaG11/Prueba.git)
    cd Prueba
    git checkout develop # Asegúrate de estar en la rama de desarrollo
    ```

2.  **Configurar la Base de Datos MySQL**:
    * Asegúrate de tener un servidor MySQL en ejecución.
    * Crea una base de datos nueva (net_team).
    * Actualiza el archivo `src/main/resources/application.properties` (o `application.yml`) con las credenciales de tu base de datos:
        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/net_team
        spring.datasource.username=tu_usuario_mysql
        spring.datasource.password=tu_contraseña_mysql
        spring.jpa.show-sql=true
        ```


3.  **Construir el Proyecto**:
    * Abre el proyecto en IntelliJ IDEA.
    * IntelliJ debería reconocer el proyecto Maven y descargar las dependencias automáticamente.
    

4.  **Ejecutar la Aplicación Spring Boot**:
    * Desde IntelliJ IDEA, puedes ejecutar la clase principal `NetTeamApplication` (la que contiene el método `main`).
    
       

5. **Acceder a la API**:
    * Una vez que la aplicación esté corriendo, la API estará disponible en `http://localhost:8080` (o el puerto que hayas configurado).
    * Puedes usar Postman para probar los endpoints.

---

## Uso de la API (Ejemplos con Postman)

### Pacientes

* **Obtener todos los pacientes:**
  `GET http://localhost:8080/process/paciente`
* **Obtener paciente por un nombre en especifico:**
  `GET http://localhost:8081/process/paciente/por-nombre?nombre=JOSE`
* **Crear un nuevo paciente:**
  `POST http://localhost:8080/process/pacientes`
  **Body (raw, JSON):**
    ```json
    {
         "idPaciente": 1,
            "nombre": "MARIA FLORES",
            "edad": 45,
            "direccion": "SANTA ANA",
            "telefono": "2222-2222"
    }
    ```
* **Actualizar paciente por ID:**
  `PUT http://localhost:8080/process/pacientes/9`
  **Body (raw, JSON):** (Envía todos los campos actualizados)
    ```json
    {
        "idPaciente": 9,
            "nombre": "WENDY CASTANEDA",
            "edad": 22,
            "direccion": "Santa Ana",
            "telefono": "6788-9999"
    }
    ```
* **Eliminar paciente por ID:**
  `DELETE http://localhost:8080/process/pacientes/{id}`

### Médicos

* **Obtener todos los médicos:**
  `GET http://localhost:8080/process/medico`
* **Obtener médico por un nombre en especifico:**
  `GET http://localhost:8080/process/medico/por-nombre?nombre=`
* **Crear un nuevo médico:**
  `POST http://localhost:8080/process/medico`
  **Body (raw, JSON):**
    ```json
    {
        "id_medico": 1,
        "especialidad": "ODONTOLOGÍA",
        "telefono": "7676-5555",
        "email": "mario@gamil.com",
        "nombre_medico": "MARIO FUNES"
    }
    ```
* **Actualizar médico por nombre:**
  `PUT http://localhost:8080/process/medico/{id}`
  **Body (raw, JSON):**
    ```json
    {
        "id_medico": 3,
        "especialidad": "CIRUGIA GENERAL", 
        "telefono": "7890-3349",
        "email": "sara@gmail.com",
        "nombre_medico": "SARA MENA"
    }
    ```
* **Eliminar médico por ID:**
  `DELETE http://localhost:8080/process/medicos/{id}`

### Citas Médicas

* **Obtener todas las citas:**
  `GET http://localhost:8080/process/cita_medica`
* **Obtener detalles mas especificos:**
  `GET http://localhost:8080/process/citas/details`
* **Crear una nueva cita:**
  `POST http://localhost:8080/process/cita_medica`
  **Body (raw, JSON):**
    ```json
    {
        "idcita_medica": 4,
        "fecha": "2025-04-11T06:00:00.000+00:00",
        "motivo": "DOLOR DE GARGANTA",
        "estado": "PENDIENTE",
        "id_paciente": 3,
        "id_medico": 1
    }
    ```
* **Actualizar cita por ID:**
  `PUT http://localhost:8080/process/citas/{id}`
  **Body (raw, JSON):**
    ```json
    {
        "idcita_medica": 4,
        "fecha": "2025-04-11T06:00:00.000+00:00",
        "motivo": "DOLOR DE GARGANTA",
        "estado": "CONFIRMADO",
        "id_paciente": 3,
        "id_medico": 1
    }
    ```
* **Eliminar cita por ID:**
  `DELETE http://localhost:8080/process/cita_medica/{id}`
