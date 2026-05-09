package aulas.rede.sala.servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class RecebedorDeMensagens implements Runnable {
    
    private Socket conexao;
    private ObjectInputStream input;
    private ArrayList<ObjectOutputStream> outputs;

    public RecebedorDeMensagens(Socket conexao, ArrayList<ObjectOutputStream> outputs) throws Exception {
        this.conexao = conexao;
        this.outputs = outputs;
        
        this.input = new ObjectInputStream( this.conexao.getInputStream() );
    }
    
    @Override
    public void run() {
        while(true) {
            try {
                
                String mensagem = (String) input.readObject();
                
                for( ObjectOutputStream output : outputs ) {
                    try {
                        output.writeObject( mensagem );
                    } catch(Exception ex) {
//                        ex.printStackTrace();
                    }
                }
                
            } catch(Exception ex) {
//                ex.printStackTrace();
            }
        }
    }
    

}
