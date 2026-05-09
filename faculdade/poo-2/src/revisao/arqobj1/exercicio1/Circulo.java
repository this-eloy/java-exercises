package revisao.arqobj1.exercicio1;

public class Circulo extends ObjetoBidimensional{

    public Circulo(Ponto2D pontoA, Ponto2D pontoB) {
        super(pontoA, pontoB);
    }

    @Override
    public double getArea() {
        double resultado, diametro, raio;
        
        diametro = getPontoA().getDistancia(getPontoB());
        raio = diametro/2.0;
        resultado = Math.PI * (raio*raio);
       
        return resultado;
    }

    @Override
    public String toString() {
        return "Circulo, " + super.toString();
    }
    
    
    
}
