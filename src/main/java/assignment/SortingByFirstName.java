package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByFirstName {
    public static void main(String args[]) {

        //Consider a list of employees, sort the employees by their firstName and
        // return the sorted list of employees.

        List<Employee> employees = Arrays.asList(
                new Employee("Akhila", "chekuri", "HR"),
                new Employee("Bob", "Smith", "Finance"),
                new Employee("Taylor", "Swift", "HR"),
                new Employee("Robert", "Downey", "Admin"),
                new Employee("cap", "America", "Finance"));

       List<Employee> sortedEmployees= employees.stream()
                                        .sorted(Comparator.comparing(Employee::getFirstName))
                                        .collect(Collectors.toList());

       sortedEmployees.forEach(System.out::println);



    }
}
