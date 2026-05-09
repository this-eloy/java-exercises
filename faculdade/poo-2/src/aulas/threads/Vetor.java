package aulas.threads;

import java.util.Arrays;

public class Vetor {
    private int[] array;
    private int indice;

    public Vetor(int tamanho) {
        array = new int [tamanho];
        indice = 0;
    }
    
    // public void adicionar(int valor){
    public synchronized void adicionar(int valor){
        int i = indice;
        
        array[i] = valor;
        System.out.println(valor + " adicionado na posição "+ i);
        indice++;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
}
