package aulas.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OperacoesFluxoInt {
    public static void main(String[] args) {
        int[] vetor = {5 ,13, 9 , 66, 36};
        
        System.out.println(Arrays.toString(vetor));
        
        System.out.println("---");
        
        //forEach é uma operação terminal (encerra o fluxo)
        Arrays.stream(vetor)
                .forEach((e)-> System.out.println(e));
        
        System.out.println("---");
        
        IntStream.of(vetor)
                .forEach((e)-> System.out.println(e));
        
        System.out.println("---");
        
        IntStream.of(vetor)
                .forEach((e)-> System.out.print(e));
        System.out.print("\n");
        
        System.out.println("---");
        
        //reduce é uma operação terminal (encerra o fluxo)
        int resultado;
        //somatório, por isso sai de 0
        resultado = Arrays.stream(vetor)
                .reduce(0, (x, y)-> x + y);
        System.out.println(resultado);
        
        System.out.println("---");
                
        //produtório, por isso sai de 1
        resultado = Arrays.stream(vetor)
                .reduce(1, (x, y)-> x * y);
        System.out.println(resultado);
        
        System.out.println("---");
        
        // filter e map sao operações intermediarias
        
        //imprimir pares
        IntStream.of(vetor)
                .map((e) -> e + 1 )
                .filter((e) -> {
                    return e % 2 == 0;
                })
                .forEach((e)-> System.out.println(e));
        
        System.out.println("---");
        
        //imprimir impares
        IntStream.of(vetor)
                .filter((e) -> e % 2 != 0)
                .forEach((e)-> System.out.println(e));
        
        System.out.println("---");
        
        Integer[] array = {5 ,13, 9 , 66, 36};
        
        List<Integer> lista;
        lista = Arrays.stream(array)
                .filter( (e) -> e <= 50 )
                .sorted()
                .collect(Collectors.toList());
        System.out.println(lista);
        
        System.out.println("---");
        
        System.out.println("max():" + IntStream.of(vetor).max().getAsInt());
        System.out.println("min():" + IntStream.of(vetor).min().getAsInt());
        System.out.println("sum():" + IntStream.of(vetor).sum());
        System.out.println("avarage():" + IntStream.of(vetor).average().getAsDouble());
        
        System.out.println("---");
    }
}
