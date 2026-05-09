package aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws Exception {
        
        int porta = 12345;
        int backlog = 2;
        InetAddress endereco = InetAddress.getByName("10.105.68.13");

        ServerSocket servidor;
        servidor = new ServerSocket(porta, backlog, endereco);
        System.out.println("Servidor Inicializado ( " + servidor + " ).\n");
        
        Socket conexao;        
        System.out.println( "Esperando por Conexão.\n" );
        conexao =  servidor.accept();
        System.out.println( "Conexão Recebida: " + conexao.getInetAddress() + "\n" );
        
        ObjectOutputStream output;
        ObjectInputStream input;
        
        output = new ObjectOutputStream( conexao.getOutputStream() );
        input = new ObjectInputStream( conexao.getInputStream() );
        
        output.flush();
        System.out.println( "Obtenção de Fluxos de Entrada e Saída.\n" );
        
        String mensagem;
        mensagem = "Olá cliente." ;
        output.writeObject(mensagem);
        output.flush();
        
        mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida: " + mensagem);
        
        input.close();
        output.close(); 
        
        conexao.close();
        System.out.println("Conexão encerrada.");
        servidor.close();
        System.out.println("Servidor encerrado.");
        
    }
}
