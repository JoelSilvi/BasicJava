package sample;

public class cicloFor {
    public static void main(String[] args) {
//        for ( var contador = 0; contador < 5 ; contador++ ){
//            if( contador % 2 == 0 ){
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }

        inicio:
        for ( var contador = 0; contador < 5; contador++ ){
            if ( contador % 2 == 0){
                continue inicio; // ir a la linea de codigo de la etiqueta
            }
            System.out.println("contador = " + contador);
        }
    }
}
