package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_03_Explicit_Type_Casting {
    public static void main(String[] args) {
//        Explicit Type Casting
//Description:
//Write a Java program to convert a double value into an int using explicit type casting and print both values.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number");


        if(sc.hasNextDouble()){
      double num1 = sc.nextDouble();
        int num2 = (int)num1;

        System.out.println("Double value: " + num1);
        System.out.println("Int value after casting: " + num2);}

        else {
            System.out.println(" Enter valid double number value");
        }

        sc.close();
    }
}
