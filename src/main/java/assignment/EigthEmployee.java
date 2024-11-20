package assignment;

import java.util.Arrays;
import java.util.List;

public class EigthEmployee {
    public static void main(String args[]){

        //Consider a list of 10 employees, get the 8th employee and print his full name and department name

        List<Employee> employees = Arrays.asList(
                new Employee(23,"Akhila", "chekuri", "HR"),
                new Employee(32,"Bob", "Smith", "Finance"),
                new Employee(22,"Taylor", "Swift", "HR"),
                new Employee(56,"Robert", "Downey", "Admin"),
                new Employee(65,"cap", "America", "Finance"),
                new Employee(21,"Akhila", "chekuri", "HR"),
                new Employee(11,"Bob", "Smith", "Finance"),
                new Employee(52,"Taylor", "Swift", "HR"),
                new Employee(35,"Robert", "Downey", "Admin"),
                new Employee(64,"cap", "America", "Finance"));

        employees.stream().skip(7).findFirst()
                .ifPresent(employee -> {System.out.println(employee.getFullname());
                                     System.out.println(employee.getDepartment());});

    }
}
