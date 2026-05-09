
package aulas.excecao;

public class ErroVerificado extends Exception{

    public ErroVerificado() {
    }
    public ErroVerificado(String message) {
        super(message);
    }
    public ErroVerificado(String message, Throwable cause) {
        super(message, cause);
    }

    public ErroVerificado(Throwable cause) {
        super(cause);
    }
    
    
}
