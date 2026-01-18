package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_07_SimpleCalculatorUsingSwitchState {
    public static void main(String[] args) {
//        7) Simple Calculator
//
//Description:
//Write a Java program to
// perform addition, subtraction, multiplication, or division based on user choice using a switch statement.
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");

        if(!sc.hasNextDouble()){
            System.out.println("Please enter valid integer number");
            sc.close();
            return;
        }

        double num1 =sc.nextDouble();

        System.out.println("Enter Second number");

        if(!sc.hasNextDouble()){
            System.out.println("Please enter valid integer number");
            sc.close();
            return;
        }
        double num2 =sc.nextDouble();

        System.out.println("Choose an operation ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Substraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");

        if(!sc.hasNextInt()){
            System.out.println("Please Enter valid integer");
            sc.close();
            return;
        }

        int choice= sc.nextInt();
        double result;

switch (choice){

    case 1:
        result = num1 + num2;
        System.out.println(result);
        break;
    case 2:
        result = num1 - num2;
        System.out.println(result);
        break;
    case 3:
        result = num1*num2;
        System.out.println(result);
        break;
    case 4:
        result = num1/num2;
        System.out.println(result);
        break;
    default:
        System.out.println("Please select option between 1 -4");
}
sc.close();
    }

}
