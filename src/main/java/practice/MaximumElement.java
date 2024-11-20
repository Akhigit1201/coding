package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumElement {

    public static void main(String args[]){

       List<Integer> numbers = Arrays.asList(67,98,63,90,45,98);

        List<String> fruits= Arrays.asList("banana","apple","apricot","pineapple","papaya","orange","pineapple","banana");

//       List<Person> person = Arrays.asList(
//               new Person("Akhila",26),
//               new Person("Alice",30),
//               new Person("Bob",22),
//               new Person("Tom",36),
//               new Person("Jhon",35)
//               );
//
//       person.stream().sorted(Comparator.comparing(Person::getName)).forEach(n->System.out.println(n));

        //To get the maximum number in a list
 //         int max=  numbers.stream().max(Comparator.naturalOrder()).get();
   //        System.out.println(max);


        //to remove the duplicate elemets from list of string or integers
        //fruits.stream().distinct().forEach(n->System.out.println(n));
       // numbers.stream().distinct().forEach(n->System.out.println(n));



        //Concatenation of strings
        //String conc = fruits.stream().collect(Collectors.joining(","));
        //System.out.println(conc);


         //To get the string from list of string which starts with particular letter
        List<String> strats = fruits.stream().filter(s -> s.startsWith("p")|| s.startsWith("a") ).collect(Collectors.toList());
         System.out.println(strats);


        //To convert the given list of strings into uppercase
        //fruits.stream().map(fruit -> fruit.toUpperCase()).forEach(System.out::println);


        //to filter the list of integer for even numbers
        //numbers.stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));


        //to get the avg of numbers present in an list of double integers
//        List<Double> numbers = Arrays.asList(2.3,3.4,4.6,7.8);
//        double avg= numbers.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//        System.out.println(avg);
        //boolean cond =numbers.stream().anyMatch(n->n%2==0);
        //System.out.println(cond);





    }
}
