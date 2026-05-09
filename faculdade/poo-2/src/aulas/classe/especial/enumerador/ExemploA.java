package aulas.classe.especial.enumerador;

public class ExemploA {    
    public static void main(String[] args) {
        
        FormaGeometricaA circulo = new FormaGeometricaA( FormaGeometricaA.Cor.AZUL, FormaGeometricaA.Cor.BRANCO  );
        System.out.println( circulo );
        
        System.out.println("-----");
        
        System.out.println( FormaGeometricaA.Cor.values()[0] );
        for( FormaGeometricaA.Cor cor : FormaGeometricaA.Cor.values() ) {
            System.out.println( cor );
        }
        
    }
}