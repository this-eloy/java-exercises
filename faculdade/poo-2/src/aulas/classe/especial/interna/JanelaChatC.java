package aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JanelaChatC extends JanelaChat {

    public JanelaChatC() {
        
        jButtonApagar.addActionListener( new ActionListener() { // é um objeto de uma classe anônima que implmenta ActionListener (tem 1 método)
            @Override
            public void actionPerformed(ActionEvent ae) {
               apagarMensagem();
            }            
        } );
        
        jButtonEnviar.addActionListener( new ActionListener() { // é um objeto de uma classe anônima que implmenta ActionListener (tem 1 método)
            @Override
            public void actionPerformed(ActionEvent ae) {
                enviarMensagem();
            }            
        } );
        
        jTextAreaMensagem.addKeyListener( new KeyListener() { // é um objeto de uma classe anônima que implmenta KeyListener (tem 3 métodos)
            @Override
            public void keyTyped(KeyEvent ke) {}

            @Override
            public void keyPressed(KeyEvent ke) {}

            @Override
            public void keyReleased(KeyEvent ke)  {
                if( ke.getKeyCode() == 10 ) {
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
        
        new JanelaChatC();
        
    }

}