package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NotInDepartment {
    public  static void main(String args[]){

        //Consider a list of employees, and if a department name is given as argument,
        // list out the employees which doesn't belong to that department

        List<Employee> employees = Arrays.asList(
                new Employee("AKhila","chekuri","HR"),
                new Employee("Bob","Smith","Finance"),
                new Employee("Taylor","Swift","HR"),
                new Employee("Robert","Downey","Admin"),
                new Employee("cap","America","Finance"));


        String departmentToExclude = "hr";
        List<Employee> employee = employees.stream().filter(s->!s.getDepartment()
                .equalsIgnoreCase(departmentToExclude)).collect(Collectors.toList());
        employee.forEach(System.out::println);


    }
}
