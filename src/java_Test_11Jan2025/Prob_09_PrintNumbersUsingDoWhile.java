package java_Test_11Jan2025;

public class Prob_09_PrintNumbersUsingDoWhile {
    public static void main(String[] args) {
//9) Print Numbers Using do-while
//
//Description:
//Write a Java program to print numbers from 1 to 10 using a do-while loop.
//        Interview Tip
//
//Why use do-while?
//Because it guarantees at least one execution, even if the condition is false initially.
        int a=0;
        do{
            System.out.println(a);
            a++;
        }
        while(a<=10);
    }
}
