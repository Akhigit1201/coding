package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfElements {

    public static void main(String args[]){

        List<Integer> numbers = Arrays.asList(2,7,9,7,3,12,67);

        Stream<Integer> stream = numbers.stream();
        int  sumOfElements = stream.mapToInt(Integer::intValue).distinct().sum();
        System.out.println(sumOfElements);
    }
}
