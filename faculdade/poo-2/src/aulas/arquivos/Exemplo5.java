package aulas.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemplo5 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(19);
        Pessoa pessoa2 = new Pessoa(50);
        
     
        File arq = new File("arquivo.ifsp");
        FileOutputStream fluxo;
        ObjectOutputStream escritor;
        
        try {
        
            fluxo = new FileOutputStream(arq);
            escritor = new ObjectOutputStream(fluxo);
            
            escritor.writeObject(pessoa1);
            escritor.writeObject(pessoa2);
            
            escritor.close();
            fluxo.close();
        
        }catch(IOException ex){
            System.out.println("Erro IOException ocorreu: " + ex.getMessage());
        }finally{
            fluxo = null;
            escritor = null;
        }
        
        
    }
    
}
