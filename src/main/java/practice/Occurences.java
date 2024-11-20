package practice;

import java.util.*;

public class Occurences {

    public static void main(String[] args) {
        // The given list
//            List<String> fruits = Arrays.asList("papaya", "banana", "banana", "papaya", "apple","apple","orange");
//            // A HashMap to store the occurrences
//            Map<String, Integer> fruitCount = new HashMap<>();
//            // Iterate over the list and count occurrences
//            for (String fruit : fruits) {
//                fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
//            }
//            // Print the occurrences
//            for (Map.Entry<String, Integer> entry : fruitCount.entrySet()) {
//                System.out.println(entry.getKey() + ": " + entry.getValue());
//            }

        // The given list
        List<String> fruits = Arrays.asList("papaya", "banana", "banana", "papaya", "apple", "orange", "apple");
        // Count occurrences using a HashMap
        Map<String, Integer> fruitCountMap = new HashMap<>();
        for (String fruit : fruits) {
            fruitCountMap.put(fruit, fruitCountMap.getOrDefault(fruit, 0) + 1);
        }
        // Convert the map to a list of entries and sort in descending order based on counts
        List<Map.Entry<String, Integer>> sortedFruits = new ArrayList<>(fruitCountMap.entrySet());

        sortedFruits.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        // Print the sorted counts
        for (Map.Entry<String, Integer> entry : sortedFruits) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
