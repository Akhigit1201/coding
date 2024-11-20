package org.example;

import java.util.Scanner;

public class Palindrome {

    public static void main(String args[]){

        String original,reverse="";
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the String/number:");
        original=scanner.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
            reverse=reverse+original.charAt(i);
        if(original.equals(reverse)){
            System.out.print("Entered string/number is palindrome");
        }
        else{
            System.out.print("Entered number/string is not palindrome");
        }
    }
}
