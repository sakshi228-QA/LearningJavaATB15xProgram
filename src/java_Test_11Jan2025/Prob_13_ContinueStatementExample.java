package java_Test_11Jan2025;

public class Prob_13_ContinueStatementExample {
    public static void main(String[] args) {

        //    break exits the loop completely
//continue skips the current iteration only

//    13) Continue Statement Example
//
//Description:
//Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.
        int i=1;
        do{
            if(i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        while(i<=10);
//without using continue statement
        System.out.println("Without using continue statement");
        System.out.println("--------------------------------");
        int q = 1;

        do {
            if (q != 5) {
                System.out.println(q);
            }
            q++;
        } while (q <= 10);
    }

            }

