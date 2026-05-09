package aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

// ActionListener é uma interface funcional, dispõe de somente um método (actionPerformed)
public class ApagarMensagem implements ActionListener {
    
    private JTextArea jTextAreaMensagem;

    public ApagarMensagem(JTextArea jTextAreaMensagem) {
        this.jTextAreaMensagem = jTextAreaMensagem;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Apagar Mensagem");
        jTextAreaMensagem.setText("");
        jTextAreaMensagem.requestFocusInWindow();
    }

}