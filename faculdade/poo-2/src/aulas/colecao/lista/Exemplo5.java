package aulas.colecao.lista;
import aulas.colecao.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo5 {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        final Pessoa p1 = new Pessoa("Carlos", 51);
        lista.add(new Pessoa("José", 16));
        final Pessoa p2 = new Pessoa("José", 15);
        final Pessoa p3 = new Pessoa("Maria", 35);
        
        // p2 = new Pessoa("José", 19); //a variável é não modificável
        p2.setIdade(19); //objeto é mutável
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        System.out.println(lista);
        
        Collections.sort(lista);
        
        System.out.println(lista);
        
        List<Pessoa> listaVis = Collections.unmodifiableList(lista); //mesma referencia 
        
//        Collections.synchronizedList(listaVis);
                
        System.out.println(listaVis.get(2));
        
        // listaVis.remove(2); // n é removivel
        lista.remove(2);
    }
}
