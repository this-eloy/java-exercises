package revisao.arqobj1.exercicio1;

public class Retangulo extends ObjetoBidimensional{

    public Retangulo(Ponto2D pontoA, Ponto2D pontoB) {
        super(pontoA, pontoB);
    }

    @Override
    public double getArea() {
        double resultado, altura, largura;
        
        largura = getPontoB().getX() - getPontoA().getX();
        altura = getPontoB().getX() - getPontoA().getY();
        
        resultado = altura * largura; 
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Retângulo, " + super.toString();
    }
    
}
