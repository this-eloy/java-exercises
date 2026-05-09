package aulas.lambda;

import aulas.classe.especial.interna.JanelaChat;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JanelaChatD extends JanelaChat {

    public JanelaChatD() {
        
        // função lambda (metodo anonimo)
        jButtonApagar.addActionListener( (ae) -> {
            System.out.println("lambda"); 
            apagarMensagem();
        } );
        
        // função lambda (metodo anonimo)
        jButtonEnviar.addActionListener( (ae) -> enviarMensagem() );
        
        // é um objeto de uma classe anônima que implmenta KeyListener (tem 3 métodos)
        jTextAreaMensagem.addKeyListener( new KeyListener() { 
            
            private int getEnterCode() {
                return 10;
            }
            
            @Override
            public void keyTyped(KeyEvent ke) {}

            @Override
            public void keyPressed(KeyEvent ke) {}

            @Override
            public void keyReleased(KeyEvent ke)  {
                if( ke.getKeyCode() == getEnterCode() ) {
                    enviarMensagem();
                }
            }            
        } );
        
    }
    
    private void apagarMensagem() {
        System.out.println("apagar mensagem");
        jTextAreaMensagem.setText("");
        jTextAreaMensagem.requestFocusInWindow();
    }
    
    private void enviarMensagem() {
        System.out.println("Enviar Mensagem");
        String mensagem = jTextAreaMensagem.getText();
        if( mensagem.isBlank() == false && 
                mensagem.isEmpty() == false ) {
            mensagem += "\n";
            jTextAreaHistorico.append( mensagem );
            jTextAreaMensagem.setText("");
        }
        jTextAreaMensagem.requestFocusInWindow();
    }
    
    public static void main(String[] args) {
        
        new JanelaChatD();
        
    }

}