package aulas.threads;

// Runnable é uma interface funcional, isto é, dispõe de um unico método 
public class VetorEscritor implements Runnable {
    
    private int inicio, passo, fim;
    private int delay; // milesegundos
    private Vetor vetor;

    public VetorEscritor(int inicio, int passo, int fim, int delay, Vetor vetor) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        for(int i = inicio; i <= fim; i += passo){
            
            vetor.adicionar(i);
            
            try{
                Thread.sleep(delay);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
            
        }
    }

}


