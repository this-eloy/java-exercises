
package aulas.excecao;

public class Mes {
    private int valor;

    public Mes(int valor)throws Exception {
        if(valor >= 1 && valor <= 12){
            setValor(valor);
        }else{
            throw new Exception("Mes deve estar entre 1 e 12");
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws Exception {
        if(valor >= 1 && valor <= 12){
            this.valor = valor;
        }else{
            // throw new Exception("Mes deve estar entre 1 e 12");
            throw new ErroVerificado("Mes deve estar entre 1 e 12");
        }
    }
    
    @Override
    public String toString(){
        return "mes " + getValor();
    }
}
