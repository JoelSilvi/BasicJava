package sample;

public class operadoresCondicionales {
    public static void main(String[] args) {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 110;

        var resultado = valorMinimo >= 0 && valorMaximo <= 10;
        if (resultado){
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera de rango");
        }

        var vacaciones =  false;
        var diaDescanso = false;

        if( vacaciones || diaDescanso ){
            System.out.println("El padre puede asistir al juego de su hijo");
        }else {
            System.out.println("El padre NO puede asistir al juego de su hijo");
        }
    }
}
