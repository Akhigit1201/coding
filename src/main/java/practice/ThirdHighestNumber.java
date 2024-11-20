package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHighestNumber {

    public static void main(String args[]){

//       Integer[] arr = {23,45,67,12,18};
//
//     Integer thirdHighest = Arrays.stream(arr).sorted((a,b) -> b-a).skip(2).findFirst().orElse(null);
//        System.out.println(thirdHighest);

//        List<Integer> words = Arrays.asList(454,676,987,456);
//        List<Integer> palindromes = words.stream()
//                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
//                        .collect(Collectors.toList());
//
//        System.out.println("These are palindromes:" +palindromes);

        List<Integer> words = Arrays.asList(454,676,987,456);

        List<Integer>  palindrome= words.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
               .collect(Collectors.toList());
        System.out.println("These are palindromes:" +palindrome);











    }


}
