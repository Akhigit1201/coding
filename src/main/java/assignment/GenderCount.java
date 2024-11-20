package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderCount {

    public static void main(String args[]){
        //Consider a list of employees and get the count of employees based on the Gender
        List<Employee> employees = Arrays.asList(
                new Employee(23,"Akhila", "chekuri","Female", "HR"),
                new Employee(32,"Bob", "Smith","Male", "Finance"),
                new Employee(22,"Taylor", "Swift","Female", "HR"),
                new Employee(56,"Robert", "Downey", "Male","Admin"),
                new Employee(65,"cap", "America","Male", "Finance"),
                new Employee(21,"Akhila", "chekuri","Female", "HR"),
                new Employee(11,"Bob", "Smith", "Male","Finance"),
                new Employee(52,"Taylor", "Swift", "Female","HR"),
                new Employee(35,"Robert", "Downey","Male", "Admin"),
                new Employee(64,"cap", "America","Male", "Finance"));

        Map<String,Long> count = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(count);




    }
}
