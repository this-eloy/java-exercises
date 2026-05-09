package revisao.arqobj1.exercicio1;

public class Ponto2D {
    private double x, y;
    
    public Ponto2D(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistancia(Ponto2D ponto) {
        double resultado, deltaX, deltaY;
        
        deltaX = getX() - ponto.getX();
        deltaX *= deltaX;
        
        deltaY = getY() - ponto.getY();
        deltaY = Math.pow(deltaY, 2.0);
        
        resultado = Math.sqrt(deltaX + deltaY);
        
        // pow e sqrt sao estaticos, math n precisa ser importado pois se encontra no pacote java.lang
        
        return resultado;
    }
    
    public Ponto2D getPontoMedio(Ponto2D ponto){
        double xMedio, yMedio;
        Ponto2D pontoMedio;
        
        xMedio = ( getX() + ponto.getX() ) / 2.0;
        yMedio = ( getY() + ponto.getY() ) / 2.0;
        
        pontoMedio = new Ponto2D(xMedio, yMedio);
        
        return pontoMedio;
        
//        return new Ponto2D(
//            getX() + ponto.getX() / 2.0,
//            getY() + ponto.getY() / 2.0
//        );
        
    }
    
    @Override
    public String toString() {
        return "( " + getX() + ", " + getY() + " )"; 
    }
    
    
}
