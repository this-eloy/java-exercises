package aulas.classe.especial.enumerador;

public class ExemploB {    
    public static void main(String[] args) {
        
        FormaGeometricaB circulo = new FormaGeometricaB( Cor.AZUL, Cor.BRANCO  );
        System.out.println( circulo );
        
        System.out.println("-----");
        
        System.out.println( Cor.values()[0] );
        for( Cor cor : Cor.values() ) {
            System.out.println( cor );
            
            System.out.println( cor.getCodigo() );
            System.out.println( cor.getNome() );
        }
        
    }
}