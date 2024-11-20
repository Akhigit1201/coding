package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentCount {

    public static void main(String args[]){

        //Given a list of employees.Can you create a map with the count of employees each department has ?
        // with key as department name and count of employees as value.

        List<Employee> employees = Arrays.asList(new Employee("Akhila","chekuri","IT"),
                new Employee("Bob","Smith","Finance"),
                new Employee("katie","perry","IT"),
                new Employee("marlyn","monroe","Admin"),
                new Employee("Robert","Downey","IT"),
                new Employee("cap","America","finance"),
                new Employee("black","widow","Admin"));

        Map<String,Long> count =employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        System.out.println(count);
    }
}
