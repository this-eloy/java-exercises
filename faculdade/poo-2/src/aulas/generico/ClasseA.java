package aulas.generico;

public class ClasseA {
    
    private ClasseA(){}
    
    public static void imprimirVetor(String[] vetor){
        for(String str : vetor){
            System.out.println(str);
        }
    }
    public static void imprimirVetor(int[] vetor){
        for(int valor : vetor){
            System.out.println(valor);
        }
    }
    
    public static void imprimirVetor(double[] vetor){
        for(double valor : vetor){
            System.out.println(valor);
        }
    }
}
