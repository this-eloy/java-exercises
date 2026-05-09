package aulas.colecao.lista;
import java.util.ArrayList;
import aulas.colecao.Pessoa;
import java.util.Collections;
import java.util.Iterator;


public class Exemplo2 {
    public static void main(String[] args) {
        
        // está implicito objetos do tipo Object
        ArrayList lista = new ArrayList();
        
        lista.add(13.5); //boxing
        
        double valor1;
        Double valor2;
        
        valor1 = 11.75;
        valor2 = valor1; //boxing
        valor2 += 2.0;
        valor1 = valor2; //unboxing
        
        lista.add( new Pessoa("Carlos", 6) );
        
        System.out.println("------");
        
        ArrayList<Double> lista2 = new ArrayList<>();
        
        int x = 9;
        double y = 3.01;
        
        lista2.add((double)x); // coerção e boxing para double
        lista2.add(y);
        
        lista2.add(1.25);
        lista2.add(51.5);
        lista2.add(96.75);
        lista2.add(0.35);
        
        System.out.println(lista2);
        
        System.out.println(lista2.size());
        System.out.println(lista2.get(0));
        
        System.out.println(lista2);
        
        System.out.println("------");
        
        Collections.sort(lista2);
        System.out.println(lista2);
        System.out.println("--");
        Collections.shuffle(lista2);
        System.out.println(lista2);
        
        System.out.println("------");
        
        Iterator iterator = lista2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        
        System.out.println(lista2);
        
        System.out.println("------");
    }
}
