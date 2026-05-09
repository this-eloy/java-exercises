package aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaChatB extends JanelaChat implements ActionListener {

    public JanelaChatB() {
        
        jButtonApagar.addActionListener( new ApagarMensagem() ); // classe interna
        
        jButtonEnviar.addActionListener( this ); // auto referência
        
    }
    
    // classe interna, está dentro do contexto de JanelaChatB e por sua vez, tem acesso aos recursos de JanelaChatB (inclusive os herdados de JanelaChat)
    private class ApagarMensagem implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("apagar mensagem");
            jTextAreaMensagem.setText("");
            jTextAreaMensagem.requestFocusInWindow();
        }        
    }
    
    public void actionPerformed(ActionEvent ae) {
        enviarMensagem();
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
        
        new JanelaChatB();
        
    }

}