package ex_05_If_Condition;

import java.util.Scanner;

public class Lab007_PercentageCalculator {
    public static void main(String[] args) {
//        Write a program that calculates and displays the letter grade for a given numerical score
//        (e.g., A, B, C, D, or F) based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks= sc.nextInt();

        if(marks<=100 && marks>=90){
            System.out.println("Grade A");
        }
        else if(marks<=89 && marks>=80){
            System.out.println("Grade B");
        }
        else if(marks<=79 && marks>=70){
            System.out.println("Grade C");
        }
        else if(marks<=69 && marks>=60){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }
        sc.close();
    }
}
