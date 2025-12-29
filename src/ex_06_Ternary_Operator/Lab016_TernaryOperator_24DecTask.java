package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab016_TernaryOperator_24DecTask {
    public static void main(String[] args) {
       //to print mx out of three numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        int Result= num1 > num2 ? ((num1 > num3) ? num1 : num3) : ((num2 > num3)? num2 : num3);

        System.out.println("Max number is :" + Result);
    }
}
