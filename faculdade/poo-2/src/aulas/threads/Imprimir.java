package aulas.threads;

// Runnable é uma interface funcional, isto é, dispõe de um unico método 
public class Imprimir implements Runnable {
    
    private int inicio, passo, fim;
    private int delay; // milesegundos

    public Imprimir(int inicio, int passo, int fim, int delay) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
    }

    @Override
    public void run() {
        for(int i = inicio; i <= fim; i += passo){
            
            System.out.println("> " + i);
            
            try{
                Thread.sleep(delay);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
        }
    }

}


