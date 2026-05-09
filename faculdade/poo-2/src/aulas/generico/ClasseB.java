package aulas.generico;

public class ClasseB {
    
    //pode ter varios tipos genericos ex: <T, A, K>
    
    public static <T> void imprimirVetor(T[] vetor){
        for(T valor : vetor){
            System.out.println(valor.toString());
        }
    }
    
    public static <T extends Comparable<T> > T maxVetor(T[] vetor){
        T resultado = vetor[0];
        
        for(T valor : vetor){
            if(resultado.compareTo(valor) < 0){
                resultado = valor;
            }
        }
        return resultado;
    }
}
