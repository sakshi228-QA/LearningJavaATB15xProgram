package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_01_Arithmetic_Operations_on_Two_Numbers {
    public static void main(String[] args) {
//        1) Arithmetic Operations on Two Numbers
//        Description:
//        Write a Java program that takes two
//        integer numbers and prints their sum, difference, multiplication, division, and remainder.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 & num2");

        if (sc.hasNextInt()){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("sum " + (num1 + num2));
            System.out.println("difference " + (num1 - num2));
            System.out.println("multiplication " + (num1 * num2));
            System.out.println("division " + (num1/num2));
            System.out.println("reminder " + (num1%num2));

        }

        else {
            System.out.println("please enter valid integer number");
        }
        sc.close();
    }

}
