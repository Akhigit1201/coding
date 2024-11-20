package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatName {

    public static void main(String args[]){

        //Consider a list of employees, concat the fullName of all the employees with pipe (|) and
        // return the concatenated string

        List<Employee> employees = Arrays.asList(
                new Employee(23,"Akhila", "chekuri", "HR"),
                new Employee(32,"Bob", "Smith", "Finance"),
                new Employee(22,"Taylor", "Swift", "HR"),
                new Employee(56,"Robert", "Downey", "Admin"),
                new Employee(65,"cap", "America", "Finance"));

        String fullName = employees.stream().map(Employee::getFullname).collect(Collectors.joining("|"));
        System.out.println(fullName);



    }
}
