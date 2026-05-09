package aulas.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperacoesFluxoEmpregado {
    public static void main(String[] args) {
        Empregado[] vetor = { 
            new Empregado("Carlos", 1500.00), 
            new Empregado("Maria", 5000.00), 
            new Empregado("José", 3500.00)};
        
        System.out.println(vetor);
        System.out.println(Arrays.toString(vetor));
        
        System.out.println("---");
        
        Arrays.stream(vetor)
                .map( (e)-> {
                    e.setSalario(e.getSalario() * 1.10);
                    return e;
                })
                .forEach( (e)-> System.out.println(e));
        
        System.out.println("---");
        
        List<Empregado> lista = new ArrayList<>( Arrays.asList(vetor));
        
        lista.add(new Empregado("Andre", 10000));
        
        System.out.println(lista);
        
        System.out.println("---");
        
        List<Empregado> aux = lista.stream()
                .filter( (e) -> e.getSalario() > 3000 && e.getSalario() < 5000)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(aux);
        
        System.out.println("---");
        
        aux = lista.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(aux);
        
        System.out.println("---");
        
        aux = lista.stream()
                .sorted(Comparator.comparing( (e)-> e.getNome() ))
                .collect(Collectors.toList());
        System.out.println(aux);
        
        
    }
    
}
