package org.example;

public class SwapNumbersWithoutThirdVariable {

    public static void main(String args[]){

        int a=10;
        int b=24;

        System.out.println(a +"and" +b);

        b=a+b;
        a=b-a;
        b=b-a;

        System.out.println(a+"and" +b);

    }
}
