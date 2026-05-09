package aulas.rede.jogo;

public class MainServidor {
    public static void main(String[] args) throws Exception {
        
        ServidorJogo servidor = new ServidorJogo();
        
        servidor.iniciar();
//        servidor.conectar(); //espera a conexao de 2 jogadores
//        servidor.comunicar();
        
    }
}