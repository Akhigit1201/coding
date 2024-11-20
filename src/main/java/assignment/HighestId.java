package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestId {
    public static void main(String args[]){

        //Consider a list of employees, return the employee whose empId is highest.

        List<Employee> employees = Arrays.asList(
                new Employee(23,"Akhila", "chekuri", "HR"),
                new Employee(32,"Bob", "Smith", "Finance"),
                new Employee(22,"Taylor", "Swift", "HR"),
                new Employee(56,"Robert", "Downey", "Admin"),
                new Employee(65,"cap", "America", "Finance"));

        Optional<Employee> highestID= employees.stream().max(Comparator.comparing(employee-> employee.getId().get()));
        System.out.println(highestID);














    }
}
