package ex_05_If_Condition;

import java.util.Scanner;

public class Lab009_TriangleClassifier {

    //        Write a program that classifies a triangle based on its side lengths. Given three input
//        values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
//        isosceles (exactly two sides are equal), or scalene (no sides are equal).
//        Use an if-else statement to classify the triangle.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side 1");
        int side1=sc.nextInt();

        System.out.println("Enter Side 2");
        int side2=sc.nextInt();

        System.out.println("Enter Side 3");
        int side3=sc.nextInt();

        if(side1==side2 && side2==side3){
            System.out.println("triangle is equilateral");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("triangle is isosceles");
        }
        else{
            System.out.println("triangle is scalene");
        }
        sc.close();
    }
}
