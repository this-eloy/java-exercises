package aulas.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImprimirMain {
    public static void main(String[] args) {
        Imprimir pares = new Imprimir(0, 2, 100, 250);
        Imprimir impares = new Imprimir(1, 2, 100, 250);
        
//        pares.run();
//        impares.run();
        // 25 segundos p executar

//        Thread thread1 = new Thread(pares);
//        Thread thread2 = new Thread(impares);

//        thread1.start();
//        thread2.start();
        // 12 segundos p executar
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        // encerra todas as threads, após a execução de suas respectivas tarefas.
        executorThreads.shutdown();
        
        System.out.println("fim da main();");
    }
}
