package revisao.arqobj1.exercicio1;

public abstract class ObjetoBidimensional implements GeometriaBidimensional {
    private Ponto2D pontoA, pontoB;

    public ObjetoBidimensional(Ponto2D pontoA, Ponto2D pontoB) {
        setPontoA(pontoA);
        setPontoB(pontoB);
    }

    public Ponto2D getPontoA() {
        return pontoA;
    }

    public void setPontoA(Ponto2D pontoA) {
        if(pontoA != null){
            this.pontoA = pontoA;
        }else{
            throw new IllegalArgumentException("Ponto A não pode ser nulo");
        }
    }

    public Ponto2D getPontoB() {
        return pontoB;
    }

    public void setPontoB(Ponto2D pontoB) {
        if(pontoB != null){
            this.pontoB = pontoB;
        }else{
            throw new IllegalArgumentException("Ponto B não pode ser nulo");
        }
    }
    //implementações comuns devem estar na abse da hierarquia
    
    @Override
    public Ponto2D getCentro() {
        return pontoA.getPontoMedio(getPontoB());
    }

    @Override
    public String toString() {
        return "Objeto Bidimensional de pontos opostos " + "( " + getPontoA() + ", " + getPontoB() + " )";
    } 
    
}
