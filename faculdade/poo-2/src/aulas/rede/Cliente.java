package aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws Exception {
        
        int porta = 12345;
        InetAddress endereco = InetAddress.getByName("10.105.68.13");
        
        Socket conexao = new Socket(endereco, porta);
        System.out.println( "Conexão Realizada: " + conexao.getLocalAddress().getHostName() + ":" + conexao.getLocalPort() + "\n" );
        
        ObjectOutputStream output;
        ObjectInputStream input;
        
        output = new ObjectOutputStream( conexao.getOutputStream() );
        input = new ObjectInputStream( conexao.getInputStream() );
        
        output.flush();
        System.out.println( "Obtenção de Fluxos de Entrada e Saída.\n" );
        
        String mensagem;
        mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida: " + mensagem);
        
        mensagem = "Olá Servidor." ;
        output.writeObject(mensagem);
        output.flush();
        
        input.close();
        output.close();
        
        conexao.close();
        System.out.println( "Conexão Encerrada.\n" );
        
    }
}
