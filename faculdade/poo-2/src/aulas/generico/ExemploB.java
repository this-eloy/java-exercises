package aulas.generico;
import aulas.colecao.Pessoa;

public class ExemploB {
    public static void main(String[] args) {
        // genericos envolvem tipos por referencia, voce deve usar a classe empacotadora, ex: int -> Integer
        String[] vetorStrings = {"vermelho", "azul", "verde"};      
        Integer[] vetorInteiros = {5, 13, 91}; 
        Double[] vetorDoubles = {9.75, 0.25, 3.50};
        Pessoa[] vetorPessoas = {new Pessoa("Carlos", 19), new Pessoa("Maria", 25), new Pessoa("José", 51)};
        
        System.out.println("--- IMPRIMIR VETOR ---");
        ClasseB.imprimirVetor(vetorStrings);
        System.out.println("-----------");
        ClasseB.imprimirVetor(vetorInteiros);
        System.out.println("-----------");
        ClasseB.imprimirVetor(vetorDoubles);
        System.out.println("-----------");
        ClasseB.imprimirVetor(vetorPessoas);
        
        System.out.println("");
        
        System.out.println("--- MAX VETOR ---");
        System.out.println(ClasseB.maxVetor(vetorStrings));
        System.out.println("-----------");
        System.out.println(ClasseB.maxVetor(vetorInteiros));
        System.out.println("-----------");
        System.out.println(ClasseB.maxVetor(vetorDoubles));
        System.out.println("-----------");
        System.out.println(ClasseB.maxVetor(vetorPessoas));
        
        
        
    }
    
}
