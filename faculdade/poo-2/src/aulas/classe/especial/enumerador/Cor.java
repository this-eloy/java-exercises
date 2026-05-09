package aulas.classe.especial.enumerador;

public enum Cor {
    
    // RGB Red Green Blue
    
    VERMELHO("Vermelho", "#FF0000"), 
    AZUL("Azul", "#0000FF"), 
    VERDE("Verde", "#00FF00"), 
    BRANCO("Branco", "#FFFFFF"), 
    PRETO("Preto", "#000000");
    
    private String nome;
    private String codigo;

    private Cor(String nome, String codigo) {
        setNome(nome);
        setCodigo(codigo);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if( codigo.startsWith("#") ) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("o código precisa começar com #");
        }
    }

    public String toString() {
        return getNome() + "(" + getCodigo() + ")";
    }
    
}