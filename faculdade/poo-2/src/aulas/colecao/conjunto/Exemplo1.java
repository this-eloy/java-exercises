package aulas.colecao.conjunto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exemplo1 {
    public static void main(String[] args) {
        
        // nao permite elementos repetidods 
        Set<String> conjunto = new HashSet();
        
        conjunto.add("vermelho");
        conjunto.add("vermelho"); // n da erro, mas não é adicionado
        conjunto.add("azul");
        conjunto.add("verde");
        
        System.out.println(conjunto);
        
        Iterator iterator = conjunto.iterator();
        while( iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
