package aulas.classe.especial.anonimo;

public class ExemploA {
    public static void main(String[] args) {
        
        new Thread( new Runnable() {
            public void run() {
                try {
                    for(int i = 0; i <= 100; i+=2) {
                        System.out.println("> " + i);
                        Thread.sleep(500);
                    }
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        } ).start();
        
        
        new Thread( new Runnable() {
            public void run() {
                try {
                    for(int i = 1; i <= 100; i+=2) {
                        System.out.println("> " + i);
                        Thread.sleep(1500);
                    }
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        } ).start();
        
    }
}