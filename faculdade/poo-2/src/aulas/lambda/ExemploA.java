package aulas.lambda;

public class ExemploA {
    public static void main(String[] args) {
        
        // função lambda (metodo anonimo)
        new Thread( () -> {
            try {
                for(int i = 0; i <= 100; i+=2) {
                    System.out.println("> " + i);
                    Thread.sleep(500);
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } ).start();
        
        // função lambda (metodo anonimo)
        new Thread( () -> {
            try {
                for(int i = 1; i <= 100; i+=2) {
                    System.out.println("> " + i);
                    Thread.sleep(1500);
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        } ).start();
        
    }
}