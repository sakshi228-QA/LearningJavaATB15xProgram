package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_04_MaximumofTwoNumbers {
    public static void main(String[] args) {

//       4) Maximum of Two Numbers
//Description:
//Write a Java program to find the maximum of two numbers using the ternary operator.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number n1");
        int n1 = sc.nextInt();
        System.out.println("Enter second number n2");
        int n2 = sc.nextInt();

        String Result = n1>n2? "n1 is greater than n2" : (n1<n2? "n2 is greater than n1": "both numbers are equal");

        System.out.println(Result);
        sc.close();

    }
}
