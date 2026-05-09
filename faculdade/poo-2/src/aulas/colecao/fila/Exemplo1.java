package aulas.colecao.fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo1 {
    public static void main(String[] args) {
        
        //FIFO first in first out
        Queue<String> fila = new LinkedList<>();
        
        fila.offer("vermelho");
        fila.offer("azul");
        fila.offer("verde");
        fila.offer("branco");
        
        System.out.println(fila);
        
        System.out.println(fila.poll()); //remove primeiro
        
        System.out.println(fila);
        
        Iterator iterator = fila.iterator();
        while( iterator.hasNext()){
            System.out.println(iterator.next());
        }
    
    }
}
