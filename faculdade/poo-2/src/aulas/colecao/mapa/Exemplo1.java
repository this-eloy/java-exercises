
package aulas.colecao.mapa;

import aulas.colecao.Pessoa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exemplo1 {
    public static void main(String[] args) {
        // <Chave,Valor> onde Chave n se repete
        Map<String, Pessoa> mapa = new HashMap<>();
        
        mapa.put("AQ204555x", new Pessoa("Thomas", 19));
        mapa.put("AQ55889a", new Pessoa("Maria", 23));
        mapa.put("AQ34889a", new Pessoa("Carlos", 32));
        
        System.out.println(mapa);
        System.out.println(mapa.get("AQ392728"));
        System.out.println(mapa.get("AQ34889a"));
        
        System.out.println(mapa.keySet());
        
        System.out.println("---");
        
        Iterator iterator = mapa.keySet().iterator();
        while(iterator.hasNext()){
            String k = (String)iterator.next();
            System.out.println(k);
            System.out.println(mapa.get(k));
        }
        
        System.out.println("---");
        
        for(String k : mapa.keySet()){
            System.out.println(k);
            System.out.println(mapa.get(k));
        }
                
                
                
    }
}
