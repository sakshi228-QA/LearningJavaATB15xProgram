package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_12_BreakStatementExample {
    public static void main(String[] args) {
 //    break exits the loop completely
//continue skips the current iteration only


//        12) Break Statement Example
//
//Description:
//Write a Java program to print numbers from 1 to 10,
// but stop the loop when the number becomes 5 using the break statement.
 int i=1;
 while(i<=10){
     if(i==5){
         break;
     }
     System.out.println(i);
     i++;
 }

 //using do while
        System.out.println("Using Do-While loop");
        System.out.println("-------------------");
 int q=1;
 do{
     if(q==5){
         break;
     }
     System.out.println(q);
     q++;
 }
 while(q<=10);

        }
    }

