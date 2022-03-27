package sample;

import java.util.Scanner;

public class switchJava {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un valor de 1 a 4");
        var numero = Integer.parseInt(consola.nextLine());
        var numeroTexto = "Valor desconcido";

        switch (numero){
            case 1:
                numeroTexto = "Numero Uno";
                break;
            case 2:
                numeroTexto = "Numero Dos";
                break;
            case 3:
                numeroTexto = "Numero Tres";
                break;
            case 4:
                numeroTexto = "Numero Cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);
    }
}
