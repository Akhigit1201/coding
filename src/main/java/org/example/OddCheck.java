package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddCheck {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int n = scanner.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(scanner.nextInt());

        }
        if (isListOdd(num)) {
            System.out.println("List contains only odd numbers" );
        } else {
            System.out.println("List doesn't contains only odd numbers");
        }

    }

    static boolean isListOdd(List<Integer> num) {
        for (int i : num) {
            if (i % 2 == 0)
                return false;
        }
        return true;

    }
}
