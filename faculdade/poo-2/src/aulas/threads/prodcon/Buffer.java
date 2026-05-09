package aulas.threads.prodcon;

public class Buffer {

    private int valor;
    private boolean ocupado;

    public Buffer() {
        valor = -1;
        ocupado = false;
    }

    public synchronized void set(int valor) throws InterruptedException {
        while(ocupado == true){
            System.out.println("Produtor tentou produzir "+ valor + ", mas o buffer está ocupado");
            wait();
        }
        
        this.valor = valor;
        ocupado = true;
        
        System.out.println("Produtor produziu "+ valor);
        
        notifyAll();
    }
    
    public synchronized int get() throws InterruptedException {
        while(ocupado == true){
            System.out.println("Consumidor tentou consumir, mas o buffer está vazio");
            wait();
        }
        
        int aux = valor;
        valor = -1;
        ocupado = false;
        
        System.out.println("Consumidor consumiu " + aux);
        
        notifyAll();
        
        return aux;
    }
    
}
