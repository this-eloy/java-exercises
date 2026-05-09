
package aulas.excecao;

public class Dia {
    private int valor;

    public Dia(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if(valor >= 1 && valor <= 31){
            this.valor = valor;
        }else{
            // throw new RuntimeException("Dia deve estar entre 1 e 31");
            throw new ErroNaoVerificado("Dia deve estar entre 1 e 31");
        }
        
    }
    
    @Override
    public String toString(){
        return "dia ( " + getValor() + " )";
    }
}
