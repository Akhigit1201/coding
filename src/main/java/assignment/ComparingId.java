package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparingId {
    public static void main(String args[]){

        //)consider list of employees and list of employee ids.
        // return the list of employees matching with the given list of employee ids.

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

        List<Integer> employeeIds= Arrays.asList(32,22,54);

        List<Employee> ids=employees.stream().filter(employee -> employeeIds.contains(employee.getId()))
                .collect(Collectors.toList());
        System.out.println(ids);
    }
}
