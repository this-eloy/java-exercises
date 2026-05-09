
package aulas.excecao;

public class ErroNaoVerificado extends RuntimeException{

    public ErroNaoVerificado() {
    }
    public ErroNaoVerificado(String message) {
        super(message);
    }
    public ErroNaoVerificado(String message, Throwable cause) {
        super(message, cause);
    }

    public ErroNaoVerificado(Throwable cause) {
        super(cause);
    }
    
    
}
