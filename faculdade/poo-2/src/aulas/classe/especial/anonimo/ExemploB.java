package aulas.classe.especial.anonimo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploB {
    public static void main(String[] args) {
        
        // memoria compartilhada passivel de ser alterada
        
        //List<Integer> buffer = new ArrayList<>();
        
        List<Integer> buffer = Collections.synchronizedList(new ArrayList<>());
        
        //classe anonima
        Thread produtor = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 1; i <= 100; i++){
                    try{
                        while(buffer.size() > 5){}
                        
                        buffer.add(i);
                        System.out.println(">>" + i);
                        Thread.sleep(250);
                        
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            }
        });
        
       // classe lambda
        Thread consumidor1 = new Thread( () -> {
            while(true){
                try{
                    if(buffer.size() != 0){
                        int valor = buffer.removeFirst(); // unboxing
                        System.out.println("<<" + valor);
                        Thread.sleep(500);
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }     
            
        });
        
        Thread consumidor2 = new Thread( () -> {
            while(true){
                try{
                    if(buffer.size() != 0){
                        int valor = buffer.get(0); // unboxing
                        buffer.remove(0);
                        System.out.println("<<" + valor);
                        Thread.sleep(750);
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }     
        });
        
        
        produtor.start();
        consumidor1.start();
        consumidor2.start();
        
    }
}
