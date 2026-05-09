package aulas.lambda;

public class ExemploABC {
    public static void main(String[] args) {
        
        InterfaceFuncionalA objA = (int a, int b) -> {
            System.out.println(a + " " + b);
            return a + b;
        };
        
        int resultado = objA.metodoA(13, 5);
        System.out.println("resultado: "+ resultado);
        
        System.out.println("----");
        
        // não é preciso informar o tipo dos parametros e definir bloco de instruções quando se tem somente uma instrução
        objA = (a, b) -> a * b;
        
        resultado = objA.metodoA(13, 5);
        System.out.println("resultado: "+ resultado);
        
        System.out.println("----");
        
        InterfaceFuncionalB objB = (b) -> System.out.println("parâmetro recebido: "+ b);
        
        objB.metodoB(5);
        
        System.out.println("----");
        
        InterfaceFuncionalC objC = ()-> System.out.println("welcome to lambda!");
        objC.metodoC();
        
        System.out.println("----");
        
        ClasseC obj = new ClasseC();
        obj.metodoC(objC);
        
        // não é preciso utilizar ;
        obj.metodoC(() -> System.out.println("Olá lambda"));
        
        
    }
}
