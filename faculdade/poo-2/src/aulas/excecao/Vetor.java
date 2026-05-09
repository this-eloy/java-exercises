package aulas.excecao;

import java.io.IOException;


public class Vetor implements ValorInteiro {
   int[] vetor;

    public Vetor(int tamanho) { 
        vetor = new int[tamanho];
    }
    
    void setValorIndice(int indice, int valor){
        vetor[indice] = valor;
    }
   
    public int getValorIndice(int indice) throws IOException{
        try{
            return vetor[indice];
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new IOException(ex);
        }
    }
    
}
