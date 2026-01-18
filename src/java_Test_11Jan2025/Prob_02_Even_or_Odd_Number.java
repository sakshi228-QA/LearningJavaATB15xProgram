package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_02_Even_or_Odd_Number {
    public static void main(String[] args) {
        //Even or Odd Number
        //Description:
        //Write a Java program to check whether a given number is even or odd using arithmetic operators.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");


if(sc.hasNextInt()){
    int num= sc.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num + " is an odd number");
        }}
else {
    System.out.println("please enter valid integer number");
}
        sc.close();
    }

}
