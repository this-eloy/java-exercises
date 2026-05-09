package aulas.rede.sala.cliente;

import java.io.ObjectInputStream;
import java.net.Socket;

public class RecebedorDeMensagens implements Runnable {
    
    private Socket conexao;
    private ObjectInputStream input;

    public RecebedorDeMensagens(Socket conexao) throws Exception {
        this.conexao = conexao;
        
        input = new ObjectInputStream( this.conexao.getInputStream() );
    }

    @Override
    public void run() {
        while(true) {
            try {
                String mensagem = (String) input.readObject();
                System.out.println( mensagem );
            } catch(Exception ex) {
//                ex.printStackTrace();
            }
        }
    }

}

