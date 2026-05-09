package aulas.colecao.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exemplo4 {
    public static void main(String[] args) {
        String[] cores = {"vermelho", "azul", "amarelo", "roxo"};
        
        // permite valores duplicados
        // LinkedList tem alto custo computacional (complexidade) para fazer acessos diretos a indices arbitrários, porém tem
        // LinkedList tem baixo custo computacional (complexidade) para inserções e remoções
        //contrario de ArrayList
        List<String> lista = new LinkedList<>( Arrays.asList(cores));
        
        System.out.println(cores);
        System.out.println(lista);
        
        lista.get(1); // alto custo computacional (complexidade)
        lista.add(1, "rosa"); // baixo custo computacional (complexidade)
        
        System.out.println(lista);
        
        System.out.println("---");
        
        Iterator iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        lista.add("vermelho");
        
        System.out.println(lista);
        
        Collections.sort(lista);
        System.out.println(lista);
        
        System.out.println(Collections.binarySearch(lista, "roxo"));
        System.out.println(Collections.binarySearch(lista, "branco"));
        
        System.out.println(Collections.frequency(lista, "roxo"));
        System.out.println(Collections.frequency(lista, "branco"));
        System.out.println(Collections.frequency(lista, "vermelho"));
    }
}
