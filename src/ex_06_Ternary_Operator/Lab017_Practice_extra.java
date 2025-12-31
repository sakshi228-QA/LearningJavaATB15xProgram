package ex_06_Ternary_Operator;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Lab017_Practice_extra {
    public static void main(String[] args) {
        //        Problem 1
//        Leap Year Checker
//        Read a year and print whether it is a leap year or not.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Year :");
//        int year = sc.nextInt();
//
//        String result= (year % 4 == 0 ) ? ((year % 100==0)? ((year % 400==0)? "Leap Year" : "Not a leap year") : "Leap Year" ) : "Not a leap year";
//        System.out.println(result);


//        Problem 2
//        Character Case Checker
//       Read a character and print whether it is an uppercase letter, lowercase letter, or not a letter.
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=  sc.next().charAt(0);
        String result2 = (ch>='A' && ch<='B')? "Upper Case" : (ch>='a' && ch<='z')? "Lower Case" : "Not a character";

        System.out.println( ch + " is " + result2);


    }
}
