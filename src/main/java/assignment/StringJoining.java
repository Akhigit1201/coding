package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoining {
    public static void main(String args[]){
        //get Male and females list separetly and join the employee full names with delimeter -

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

        String male = employees.stream().filter(e->e.getGender().equalsIgnoreCase("Male"))
                .map(Employee::getFullname).collect(Collectors.joining("-"));

        String female = employees.stream().filter(e->e.getGender().equalsIgnoreCase("Female"))
                .map(Employee::getFullname).collect(Collectors.joining("-"));

        System.out.println("Male Employees:" +male);
        System.out.println("Female Employees:"+female);

    }
}
