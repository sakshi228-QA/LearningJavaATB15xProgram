package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_05_PositiveNegativeorZero {
    public static void main(String[] args) {
        //5) Positive, Negative or Zero
        //
        //Description:
        //Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");

        if(sc.hasNextInt()){
        int num = sc.nextInt();

        String Result = num>0? "Number is +ve" : (num==0? "Number is zero" : "Number is -ve");
        System.out.println(Result);}

        else{
            System.out.println("Enter valid number");
        }

        sc.close();
    }
}
