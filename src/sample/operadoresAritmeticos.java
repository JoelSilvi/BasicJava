package sample;


public class operadoresAritmeticos {
    public static void main(String[] args) {
        int a=5, b=2;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado de la multiplicacion = " + resultado);

        var resultado2 = 3F / b;
        System.out.println("resultado de la division = " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        if( a % 2 == 0 ){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
    }
}
