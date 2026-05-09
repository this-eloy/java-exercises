package aulas.generico;

import java.util.LinkedList;
import java.util.List;

//classes genericas sao chamadas de classe parametrizada
public class Pilha <T>{
    private List<T> lista;

    public Pilha() {
        lista = new LinkedList<>();
    }
    public void adicionar(T elemento){
        lista.addFirst(elemento);
    }
    
    public T remover(){
        if(lista.isEmpty()){
            throw new RuntimeException("A pilha está vazia.");
        }
        T aux = lista.getFirst();
        lista.removeFirst();
        
        return aux;
    }
    
    public int tamanho(){
        return lista.size();
    }
    
    public boolean vazia(){
        return lista.isEmpty();
    }

    @Override
    public String toString() {
        return lista.toString();
    }
    
    
    
    
}
