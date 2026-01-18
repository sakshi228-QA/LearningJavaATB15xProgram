package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_11_ReverseNumberDoWhile {
    public static void main(String[] args) {
//        11) Reverse a Number
//
//Description:
//Write a Java program to reverse a given number using a do-while loop.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");

        if(!sc.hasNextInt()){
            System.out.println("Enter valid number");
            sc.close();
            return;
        }
        int num= sc.nextInt();
        int revnum =0;
        int rem;

        do{
            rem =num%10;
        revnum = revnum*10 + rem;
        num= num/10;

        }
        while(num!=0);

        System.out.println("Reverse number of given number is :" + revnum);
    }
}
