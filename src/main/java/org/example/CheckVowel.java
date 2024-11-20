package org.example;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input= scanner.nextLine();
        boolean vowelPresent=false;
        for(int i=0; i<input.length();i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelPresent = true;
                break;
            }
        }
            if(vowelPresent){
                System.out.println("The input string contains vowel");

            }else{
                System.out.println("The input string doesn't contains vowel");
            }





    }
}
