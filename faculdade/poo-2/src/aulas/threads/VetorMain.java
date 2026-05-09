package aulas.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VetorMain {
    public static void main(String[] args) {
        Vetor vetorCompartilhado = new Vetor(15);
        VetorEscritor pares = new VetorEscritor(0, 2, 10, 250, vetorCompartilhado);
        VetorEscritor impares = new VetorEscritor(1, 2, 10, 250, vetorCompartilhado);
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        executorThreads.shutdown();
        
        try{
            executorThreads.awaitTermination(15, TimeUnit.SECONDS);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        
        System.out.println(vetorCompartilhado);
        
    }
}
