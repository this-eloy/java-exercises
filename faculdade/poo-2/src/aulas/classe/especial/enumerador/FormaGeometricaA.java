package aulas.classe.especial.enumerador;

public class FormaGeometricaA {
    
    public enum Cor { VERMELHO, AZUL, VERDE, BRANCO, PRETO }; // static e final
    
    private Cor corPreenchimento;
    private Cor corBorda;

    public FormaGeometricaA(Cor corPreenchimento, Cor corBorda) {
        setCorPreenchimento(corPreenchimento);
        setCorBorda(corBorda);
    }

    public Cor getCorPreenchimento() {
        return corPreenchimento;
    }

    public void setCorPreenchimento(Cor corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
    }

    public Cor getCorBorda() {
        return corBorda;
    }

    public void setCorBorda(Cor corBorda) {
        this.corBorda = corBorda;
    }

    @Override
    public String toString() {
        return "Preenchimento (" + getCorPreenchimento() + "), Borda (" + getCorBorda() + ")";
    }

}