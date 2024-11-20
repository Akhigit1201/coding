package org.example;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String argss[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        if (checkPrime(number)) {
            System.out.println(number + " is  prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

        public static boolean checkPrime(int number){

            if(number <=1){
                return false;
            }
            for(int i=2; i< number;i++){
                if(number%2 == 0){
                    return false;
                }
            }
            return true;
        }
    }

