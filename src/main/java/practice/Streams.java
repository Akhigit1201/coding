package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String args[]){

//        String sentence = "Java is a programming language. Java is Versatile";
//
//  Map<String,Long>frequency =  Arrays.stream(sentence.split("\\s+"))
//          .collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
//  System.out.println(frequency);

      List<Integer> numbers = Arrays.asList(12,23,14,19,43);
        List<Integer> filterredNumbers=numbers.stream().filter(n-> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
        filterredNumbers.forEach(System.out::println);

//        String[] names= {"Akhila","Ananya","Bob","Ana","cherry"};
//       Map<Character,Long> count=  Arrays.stream(names).collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
//        System.out.println(count);

        //int[] arr = {2,8,9,2,3,9,3,5,8,32,7,6,5};

//        Map<Integer,Long> count = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n->n,Collectors.counting()))
//                .entrySet().stream()
//                .filter(i-> i.getValue()>1)
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
//      count.forEach((key,value) -> System.out.println(+key+ "- " +value));

//        int[] arrs=Arrays.stream(arr).distinct().toArray();
//        System.out.println(Arrays.toString(arrs));

        //List<String> names = Arrays.asList("level","hello","radar","deed");

//        List<String> palindromes = names.stream()
//                .filter(s->s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
//
//        System.out.println(palindromes);

        //int[] arr1 = {1,3,5,7};
        //int[] arr2 = {2,4,3,6,8};

//        int[] sortedArray = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).distinct().sorted().toArray();
//        System.out.println(Arrays.toString(sortedArray));

        /*List<String> str1= Arrays.asList("banana","apple","papaya");
        List<String> str2= Arrays.asList("banana","pineapple","orange");

        List<String> conc = Stream.concat(str1.stream(),str2.stream()).distinct().sorted().collect(Collectors.toList());
        System.out.println(conc);*/
    }
}
