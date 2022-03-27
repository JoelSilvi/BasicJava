package sample;

import java.util.Scanner;

public class EjerciciosPractivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);

        var num1 = 10;
        var num2 = 15;
        var name = "Joel";
        System.out.println("la suma de " + num1 + " y " +  num2 + " es: " + (num1+num2));
        System.out.println("la resta de " + num1 + " y " + num2 + " es: " + (num1-num2));
        System.out.println("la multiplicacion de " + num1 + " y " + num2 + " es: " + (num1*num2));
        System.out.println("la division de " + num1 + " y " + num2 + " es " + (num1/num2));
        System.out.println("el resto de " + num1 + " en " + num2 + " es " + (num1%num2));

        System.out.println("*************************************");
        System.out.println("*************************************");

        if (num1>num2){
            System.out.println(num1 + " es mayor a " + num2);
        }else if(num2>num1){
            System.out.println(num2 + " es mayor a " + num1);
        }else{
            System.out.println(num1 + " es igual a " + num2);
        }

        System.out.println("*************************************");
        System.out.println("*************************************");

        System.out.println("Bienvenido " + name);
    }


}
