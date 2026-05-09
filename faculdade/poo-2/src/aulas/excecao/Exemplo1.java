package aulas.excecao;

public class Exemplo1 {
    public static void main(String[] args) {
        String[] vetor = new String[3];
        
        vetor[2] = "IFSP";
        System.out.println(vetor[2]);
        vetor[2] = vetor[2].toLowerCase();
        System.out.println(vetor[2]);
        
        System.out.println(vetor[3]);  // da erro pois esta pedindo uma posicao q n existe
        vetor[1].toLowerCase();  // da erro, pois não é possivel usar metodos em posicao vazia
    }
}
