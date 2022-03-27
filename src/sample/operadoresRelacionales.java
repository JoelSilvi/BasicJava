package sample;

public class operadoresRelacionales {
    public static void main(String[] args) {
        int a = 3, b = 4;
        var g = a >= b;
        System.out.println("g = " + g);

        if (a % 2 == 0){
            System.out.println("Es numero par");
        }else{
            System.out.println("Es numero impar");
        }

        var edad = 17;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es un adulto");
        }else {
            System.out.println("Es menor de edad");
        }

    }
}
