package aulas.lambda;

public class Empregado implements Comparable<Empregado>{
    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new IllegalArgumentException("O nome não pode ser nulo");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario <= 0){
            throw new IllegalArgumentException("Salario não pode ser menor ou igual a 0");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return getNome() + "(" + getSalario() + ")";
    }
    
    @Override
    public int compareTo(Empregado t) {
//        Double valor1 = getSalario();
//        Double valor2 = t.getSalario();
//        return valor1.compareTo(valor2);
        if(getSalario() == t.getSalario()){
            return 0;
        }else{
            if(getSalario() > t.getSalario()){
            return 1;
            }else{
                return -1;
            }
        }
    }
    
    
}
