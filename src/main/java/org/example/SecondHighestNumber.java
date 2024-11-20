package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(23,34,45,54,67,89);

        Optional<Integer> secondHighest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        System.out.println(secondHighest.get());




    }
}
