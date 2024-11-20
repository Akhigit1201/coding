package practice;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountUsingMap {

    public static void main(String[] args) {

        String s= "aaabbcccdd";

        String result = s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c ->c, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().map(entry -> entry.getKey() + "-" + entry.getValue()).collect(Collectors.joining(" ,"));

        System.out.println(result);

    }
}
