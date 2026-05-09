package aulas.colecao.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo3 {
    public static void main(String[] args) {
        String[] cores = {"vermelho", "azul", "amarelo", "roxo"};
        
        // permite valores duplicados
        // ArrayList tem baixo custo computacional (complexidade) para fazer acessos diretos a indices arbitrários, porém tem
        // ArrayList tem alto custo computacional (complexidade) para inserções e remoções
        List<String> lista = new ArrayList<>();
        
        for(String cor : cores){
            lista.add(cor);
        }
        
        System.out.println(cores);
        System.out.println(Arrays.toString(cores));
        System.out.println(lista);
        
        lista.get(1); // baixo custo computacional (complexidade)
        lista.add(1, "rosa"); // alto custo computacional (complexidade)
        
        System.out.println(lista);
    }
}
