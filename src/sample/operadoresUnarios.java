package sample;

public class operadoresUnarios {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //incremento
        //1.- preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; //primero se incrementa la variable y despues se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2.- postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; //primero se utiliza el valor de la variable y despues se incrementa
        System.out.println("g = " + g); //teniamos pendiente un incremento
        System.out.println("h = " + h);

        //decremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i); //ya esta decrementada
        System.out.println("j = " + j); //

        var k = 4;
        var l = k--; //primero se utiliza el valor de la variable y queda un drecemento pendiente
        System.out.println("k = " + k); //tenia pendiente un decremento
        System.out.println("l = " + l);

    }
}
