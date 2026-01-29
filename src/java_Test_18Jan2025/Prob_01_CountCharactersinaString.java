package java_Test_18Jan2025;

import java.util.Scanner;

public class Prob_01_CountCharactersinaString {
    public static void main(String[] args) {
//  Program Name: Count Characters in a String
//
//Description:
//Write a Java program to count the total number of characters in a given string (excluding spaces).

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");

        String str=sc.nextLine();

        int count=0;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
             count++;
            }
        }
        System.out.println("Character count in the string is :" + count);
    }
}
