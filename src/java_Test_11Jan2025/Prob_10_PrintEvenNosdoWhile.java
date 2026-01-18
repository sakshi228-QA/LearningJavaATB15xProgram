package java_Test_11Jan2025;

public class Prob_10_PrintEvenNosdoWhile {
    public static void main(String[] args) {
//        10) Print Even Numbers
//
//Description:
//Write a Java program to print all even numbers between 1 and 50 using a do-while loop.
        int num=2;
        do{
            System.out.println(num);
            num +=2;
        }
        while (num <= 50);
        System.out.println("Second approach");
        System.out.println("-------------");
        //approach 2
        int i = 1;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }
}
