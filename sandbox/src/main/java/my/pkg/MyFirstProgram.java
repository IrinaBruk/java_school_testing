package my.pkg;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Yuriy");
        hello("Yura");
        hello("Yuriy G");

        double l = 5;
        System.out.println("Ploshad' kvadrata so storonoy " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Ploshad' pryamougolnika so storonami " + a + " , " + b + " = " + area(a, b));
    }


    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}