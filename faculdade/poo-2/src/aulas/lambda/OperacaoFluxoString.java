package aulas.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class OperacaoFluxoString {
    public static void main(String[] args) {
        String[] vetor = {"amarelo", "verde", "branco", "azul", "ROSA"};
        
        Arrays.stream(vetor)
                .map( (e) -> e.toUpperCase())
                .forEach((e) -> System.out.println(e))
                ;
        
        System.out.println("---");
        
        List<String> lista = Arrays.stream(vetor)
                .map( (e) -> e.toLowerCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(lista);
        
        System.out.println("---");
        
        lista = Arrays.stream(vetor)
                .map( (e) -> e.toLowerCase())
                // comparação costumizada
                .sorted(Comparator.comparing( (e)-> e.toUpperCase() ))
                .collect(Collectors.toList());
        System.out.println(lista);
        
        
    }
}
