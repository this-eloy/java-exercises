package aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class EnviarMensagem implements ActionListener {
    
    private JTextArea jTextAreaMensagem;
    private JTextArea jTextAreaHistorico;

    public EnviarMensagem(JTextArea jTextAreaMensagem, JTextArea jTextAreaHistorico) {
        this.jTextAreaMensagem = jTextAreaMensagem;
        this.jTextAreaHistorico = jTextAreaHistorico;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
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

}