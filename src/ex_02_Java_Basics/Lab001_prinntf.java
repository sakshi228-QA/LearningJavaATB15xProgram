package ex_02_Java_Basics;

public class Lab001_prinntf {

    public static void main(String[] args) {
//        System.out.println("This will add new line");
//        System.out.print("This will not add new line");
//
//        System.out.printf("This will print output in format");

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        // %n → new line
        int a = 10;
        System.out.printf("value of a is %d%n", a); //%n added for next line

        System.out.printf("value of a is %d",a);
    }
}
