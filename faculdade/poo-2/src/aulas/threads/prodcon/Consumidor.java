/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.threads.prodcon;

public class Consumidor implements Runnable {
    private Buffer buffer;
    private int delay;

    // Construtor (Visto no trecho <init>)
    public Consumidor(Buffer buffer, int delay) {
        this.buffer = buffer;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                // Chama o método get do buffer
                this.buffer.get(); 
                
                // Dorme pelo tempo de delay
                Thread.sleep((long) this.delay);
            }
        } catch (InterruptedException ex) {
            // Trecho que vi no bytecode: printStackTrace
            ex.printStackTrace();
        }
    }
}