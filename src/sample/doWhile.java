package sample;

public class doWhile {
    public static void main(String[] args) {
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while ( contador < 0);
    }
}
