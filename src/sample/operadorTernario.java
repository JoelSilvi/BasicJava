package sample;

public class operadorTernario {
    public static void main(String[] args) {
        var resultado = ( 8 > 5 ) ? "El primer numero es mayor" : "NO, el primer numero no es mayor";
        System.out.println("resultado = " + resultado);
        System.out.println("**********************************************************");
        var numero = 6;
        resultado = numero % 2 == 0 ? "El numero es par" : "el numero es impar";
        System.out.println("resultado = " + resultado);
    }
}
