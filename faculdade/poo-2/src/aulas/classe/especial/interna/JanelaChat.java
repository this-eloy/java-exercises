package aulas.classe.especial.interna;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JanelaChat extends JFrame {
    
    protected JTextArea jTextAreaHistorico;
    protected JScrollPane jScrollPaneHistorico;
    protected JTextArea jTextAreaMensagem;
    protected JScrollPane jScrollPaneMensagem;
    protected JButton jButtonEnviar;
    protected JButton jButtonApagar;

    public JanelaChat() {
        
        super("Super Chat");        
               
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize( 650, 477 );
        
        setLayout( new FlowLayout() );
        
        jTextAreaHistorico = new JTextArea();
        jTextAreaHistorico.setColumns(55);
        jTextAreaHistorico.setRows(20);
        jTextAreaHistorico.setLineWrap(true);
        jTextAreaHistorico.setEditable(false);
        jScrollPaneHistorico = new JScrollPane(jTextAreaHistorico);
        jScrollPaneHistorico.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(jScrollPaneHistorico);
        
        jTextAreaMensagem = new JTextArea();
        jTextAreaMensagem.setColumns(39);
        jTextAreaMensagem.setRows(5);
        jTextAreaMensagem.setLineWrap(true);
        jScrollPaneMensagem = new JScrollPane(jTextAreaMensagem);
        jScrollPaneMensagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(jScrollPaneMensagem);
        
        jButtonApagar = new JButton();
        jButtonApagar.setText("Apagar");
        add(jButtonApagar);
        
        jButtonEnviar = new JButton();
        jButtonEnviar.setText("Enviar");
        add(jButtonEnviar);
        
        setVisible(true);
        
        jTextAreaMensagem.requestFocusInWindow();
        
    }
    
    public static void main(String[] args) {
        
        new JanelaChat();        
        
    }
        
}