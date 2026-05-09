package aulas.excecao;

public class Exemplo2 {
    public static void main(String[] args) {
        String[] vetor = new String[3];
        
        try{
            
            System.out.println(vetor[0]);
            System.out.println(vetor[1]);
            System.out.println(vetor[2]);
            
            vetor[2] = "IFSP";
            System.out.println(vetor[2]);
            vetor[2] = vetor[2].toLowerCase();
            System.out.println(vetor[2]);
            
            //erros
            
            System.out.println(2/0);
            System.out.println(vetor[4]);  // da erro pois esta pedindo uma posicao q n existe
            vetor[1].toLowerCase();  // da erro, pois não é possivel usar metodos em posicao vazia
            System.out.println(vetor[3]);  // da erro pois esta pedindo uma posicao q n existe
            
        }catch(ArrayIndexOutOfBoundsException ex1){
            System.out.println("Posição inexistente");
            
            System.out.println(ex1.getMessage());
            ex1.printStackTrace();
        }catch(NullPointerException ex2){
            System.out.println("Objeto inexistente");
        }catch(Exception ex){
            System.out.println("Erro Exception ocorreu");
        }finally {
            System.out.println("O bloco finally é geralmente utilizado para liberar recursos");
        }
        
        // erros de runtime nao sao criticos e podem ser executados, qualquer um que nao herde de runtime é critico e deve ser tratado
    }
}
