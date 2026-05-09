package revisao.arqobj1.exercicio1;

public class Main {
    public static void main(String[] args) {
        ObjetoBidimensional[] objetos = new ObjetoBidimensional[5];
        
        objetos[1] = new Circulo( new Ponto2D(0.0, 0.0), new Ponto2D(5.5, 5.5));
        objetos[3] = new Retangulo( new Ponto2D(0.0, 0.0), new Ponto2D(5.5, 5.5));
        
        double areaTotal = 0.0;
        
        for(int i = 0; i < objetos.length; i++){
            System.out.println(objetos[i]);
            if(objetos[i] != null){
                areaTotal += objetos[i].getArea();
            }
        }
        
        System.out.println("A area total é: " + areaTotal);
    }
}
