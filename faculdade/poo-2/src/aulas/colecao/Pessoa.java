
package aulas.colecao;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new IllegalArgumentException("nome não pode ser nulo.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("idade não pode ser menor que 0.");
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return getNome() + "(" + getIdade() + ")"; 
    }

    @Override
    public int compareTo(Pessoa p) {
        //return getNome().compareTo(p.getNome());
        //return toString().compareTo(p.toString());
        if(getIdade() == p.getIdade()){
            return 0;
        }else{
            if(getIdade() > p.getIdade()){
                return 1;
            }else{
                return -1;
            }
        }
    }
    
    
    
    
}
