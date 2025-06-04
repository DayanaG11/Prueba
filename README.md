Sistema de gestión hospitalaria utilizando api restful con spring boot

TECNOLOGÍAS UTILIZADAS
-	Java 17
-	Spring Boot
-	Spring Data JPA
-	Hibernate
-	MySQL
-	Maven

ENTIDADES
-Paciente
-Médico
-Medicamento
-Cita médica
-Factura

Instalación
1.Clonar el repositorio
git clone https://github.com/DayanaG11/Prueba.git
cd Prueba

2.Crear base de datos
Create database net_team

3.Configurar la parte de aplicación.properties
spring.datasource.url=jdbc:mysql://localhost:3306/net_team
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA

La API cuenta con la implementación completa de operaciones CRUD(crear,obtener,actualizar,eliminar)

ENDPOINTS
-	GET /paciente - Obtener el listado de pacientes
-	GET /paciente/{id} - Obtener paciente por ID
-	GET /paciente/por-nombre?nombre{} = - Buscar paciente por nombre en especifico
-	POST /paciente - Crear paciente
-	PUT /paciente/{id} - Modificar información del paciente
-	DELETE /paciente/{id} - Eliminar paciente

Cada entidad tiene endpoints iguales,es decir que de cada entidad podemos obtener,modificar,eliminar algun dato adaptados a su contexto.

PRUEBAS
Se realizaron pruebas en Postman para poder verificar que funcionara correctamente la implementación de operaciones CRUD





