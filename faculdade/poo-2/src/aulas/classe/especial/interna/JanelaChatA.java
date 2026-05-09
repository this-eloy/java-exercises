package aulas.classe.especial.interna;

public class JanelaChatA extends JanelaChat {

    public JanelaChatA() {
        
        jButtonApagar.addActionListener( new ApagarMensagem( jTextAreaMensagem ) );
        
        jButtonEnviar.addActionListener( new EnviarMensagem( jTextAreaMensagem, jTextAreaHistorico ) );
        
    }
    
    public static void main(String[] args) {
        
        new JanelaChatA();
        
    }

}