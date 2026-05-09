package aulas.colecao.pilha;

import java.util.Iterator;
import java.util.Stack;

public class Exemplo1 {
    public static void main(String[] args) {
        
        //LIFO Last in first out
        Stack<String> pilha = new Stack();
        
        pilha.push("vermelho");
        pilha.push("azul");
        pilha.push("verde");
        pilha.push("branco");
        
        System.out.println(pilha);
        
        System.out.println(pilha.pop()); 
        
        System.out.println(pilha);
        
        Iterator iterator = pilha.iterator();
        while( iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    
    }
}
