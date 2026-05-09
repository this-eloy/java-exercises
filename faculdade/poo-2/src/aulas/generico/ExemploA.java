package aulas.generico;

public class ExemploA {
    public static void main(String[] args) {
        String[] vetorString = {"vermelho", "azul", "verde"};      
        int[] vetorInteiros = {5, 13, 91};
        double[] vetorDoubles = {5.4, 13.5, 91.3};
        
        ClasseA.imprimirVetor(vetorString);
        System.out.println("####");
        ClasseA.imprimirVetor(vetorInteiros);
        System.out.println("####");
        ClasseA.imprimirVetor(vetorDoubles);
    }
    
}
