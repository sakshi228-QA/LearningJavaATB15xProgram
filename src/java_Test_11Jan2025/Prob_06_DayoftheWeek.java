package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_06_DayoftheWeek {
    public static void main(String[] args) {
        //6) Day of the Week
        //
        //Description:
        //Write a Java program to print the name of the day based on a number (1–7) using a switch statement.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from (1-7)");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            sc.close();
            return;
        }

        int day=sc.nextInt();
    if(day<1 || day>7){
        System.out.println("Invalid input! Number must be between 1 and 7.");
        sc.close();
        return;
    }


switch (day){
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;

}
sc.close();
    }
}
