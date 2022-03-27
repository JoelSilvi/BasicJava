package sample;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class tiposPrimitivos {
    public static void main(String[] args) {
        // Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("(edad + 1) = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

//        Pedir Valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad: ");
//        edad = Integer.parseInt( consola.nextLine() );
//        System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(2);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        
    }
}
