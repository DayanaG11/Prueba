package sv.edu.catolica.NetTEAM.controller.response;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import java.io.Serializable;


@Builder
@ToString
@Data


public class MessageResponse implements Serializable {
    private String message;
    private Object data; // Un tipo genérico para cualquier dato que quieras enviar
}