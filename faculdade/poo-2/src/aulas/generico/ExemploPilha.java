package aulas.generico;

import aulas.colecao.Pessoa;

public class ExemploPilha {
    public static void main(String[] args) {
        Pilha pilhaA = new Pilha(); // está implicito o tipo Object
        
        pilhaA.adicionar("vermelho");
        pilhaA.adicionar(5);
        pilhaA.adicionar(13.5);
        pilhaA.adicionar(new Pessoa("Carlos", 19));
        
        System.out.println(pilhaA);
        System.out.println(pilhaA.remover());
        
        System.out.println("--------");
        
        //erase
        Pilha<Integer> pilhaB = new Pilha<>();
        pilhaB.vazia();
        pilhaB.adicionar(5);
        pilhaB.adicionar(13);
        pilhaB.adicionar(8);
        pilhaB.adicionar(1951);
        pilhaB.vazia();
        System.out.println(pilhaB);
        System.out.println(pilhaB.tamanho());
        System.out.println(pilhaB.remover());
        System.out.println(pilhaA);
        
    }
    
}
