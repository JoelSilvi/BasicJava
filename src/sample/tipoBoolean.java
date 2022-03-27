package sample;

public class tipoBoolean {
    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if( varBoolean ){
            System.out.println("la bandera es verdadera");
        }else {
            System.out.println("la bandera es falsa");
        }

        var edad = 17;
        var esAdulto = edad >= 18;
        if( esAdulto ){
            System.out.println("la persona es mayor de edad");
        }else {
            System.out.println("la persona es menor de edad");
        }
    }
}
