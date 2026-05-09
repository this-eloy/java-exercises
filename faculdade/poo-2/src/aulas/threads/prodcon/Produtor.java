package aulas.threads.prodcon;

public class Produtor implements Runnable {
    private Buffer buffer; // area de memoria compartilhada
    private int delay; //milesegundos

    public Produtor(Buffer buffer, int delay) {
        this.buffer = buffer;
        this.delay = delay;
    }
    
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++ ){
            try{
                buffer.set(i);
                Thread.sleep(delay);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    
}
