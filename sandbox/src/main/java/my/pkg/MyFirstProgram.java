package my.pkg;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Yuriy");
        hello("Yura");
        hello("Yuriy G");

        Square s = new Square(5);
        System.out.println("Ploshad' kvadrata so storonoy " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Ploshad' pryamougolnika so storonami " + r.a + " , " + r.b + " = " + r.area());
    }


    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }




}