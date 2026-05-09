package aulas.rede.sala.servidor;

import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {
    public static void main(String[] args) throws Exception {
        
        int porta = 12345;
        int backlog = 100;
        InetAddress endereco = InetAddress.getByName("10.105.70.236");

        ServerSocket servidor;
        servidor = new ServerSocket(porta, backlog, endereco);
        System.out.println("Servidor Inicializado ( " + servidor + " ).\n");
        
        ArrayList<ObjectOutputStream> outputs = new ArrayList();
        
        // Thread para receber conexões
        while(true) {
            try {
                
                Socket conexao;        
                System.out.println( "Esperando por Conexão.\n" );
                conexao =  servidor.accept();
                System.out.println( "Conexão Recebida: " + conexao.getLocalAddress().getHostName() + ":" + conexao.getPort() + "\n" );
                
                ObjectOutputStream output = new ObjectOutputStream( conexao.getOutputStream() );
                output.flush();
                
                outputs.add( output );
                
                // Thread ler uma conexão específica e reenvia para todas as conexões
                RecebedorDeMensagens broadcast = new RecebedorDeMensagens(conexao, outputs);
                
                Thread thread = new Thread(broadcast);
                thread.start();
                
            } catch(Exception ex) {
//                ex.printStackTrace();
            }
        }
        
    }
}

