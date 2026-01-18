package java_Test_11Jan2025;

import java.util.Scanner;

public class Prob_08_MonthNameFinderSwitchStat {
    public static void main(String[] args) {
        //8) Month Name Finder
        //
        //Description:
        //Write a Java program to print the month name based on the month number (1–12) using a switch statement.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between (1-12): ");
        if(!sc.hasNextInt()){
            System.out.println("Please enter valid number between (1-12)");
            sc.close();
            return;
        }
        int month=sc.nextInt();
        if(month<1 || month>12){
            System.out.println("Please enter valid number between (1-12)");
            sc.close();
            return;
        }

            switch (month){

                    case 1:  System.out.println("January");
                    break;
                    case 2:  System.out.println("February");
                    break;
                    case 3:  System.out.println("March");
                    break;
                    case 4:  System.out.println("April");
                    break;
                    case 5:  System.out.println("May");
                    break;
                    case 6:  System.out.println("June");
                    break;
                    case 7:  System.out.println("July");
                    break;
                    case 8:  System.out.println("August");
                    break;
                    case 9:  System.out.println("September");
                    break;
                    case 10: System.out.println("October");
                    break;
                    case 11: System.out.println("November");
                    break;
                    case 12: System.out.println("December");
                    break;
        }


sc.close();
    }
}
