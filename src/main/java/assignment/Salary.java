package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Salary {
    public static void main(String args[]){

        //Get all the employees in ascending order based on the salary.

        List<Employee> employees = Arrays.asList(
                new Employee(23,"Akhila", "chekuri","Female", "HR",25000),
                new Employee(32,"Bob", "Smith","Male", "Finance",42000),
                new Employee(22,"Taylor", "Swift","Female", "HR",34000),
                new Employee(56,"Robert", "Downey", "Male","Admin",54000),
                new Employee(65,"cap", "America","Male", "Finance",90000),
                new Employee(21,"Akhila", "chekuri","Female", "HR",56000),
                new Employee(11,"Bob", "Smith", "Male","Finance",53000),
                new Employee(52,"Taylor", "Swift", "Female","HR",65000),
                new Employee(35,"Robert", "Downey","Male", "Admin",34000),
                new Employee(64,"cap", "America","Male", "Finance",57000));

                 List<Employee> sorted =employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());

                  sorted.forEach(System.out::println);

    }
}

