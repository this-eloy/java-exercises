
package aulas.excecao;
public class Exemplo3 {
    public static void main(String[] args) {
        
        try{
            Dia dia = new Dia(27);
            Mes mes = new Mes(2);

            dia.setValor(28);
            // dia.setValor(0);

            mes.setValor(-1);
            
            System.out.println(mes);
            System.out.println(dia);
        
        }catch(Exception ex){
            System.out.println("Ocorreu um erro: " + ex.getMessage());
        }
        
        
    }
    
}
