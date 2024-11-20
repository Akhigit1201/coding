package assignment;

import java.util.Arrays;
import java.util.List;

public class FullName {

    public static void main(String args[]){

        //From the list of employees, get the first employee from the list and return his fullName.
        // where fullName = firstname + lastname.

        List<Employee> employees = Arrays.asList(new Employee("Akhila","chekuri","IT"),
                new Employee("Bob","Smith","Finance"),
                new Employee("katie","perry","IT"),
                new Employee("marlyn","monroe","Admin"),
                new Employee("Robert","Downey","IT"),
                new Employee("cap","America","finance"),
                new Employee("black","widow","Admin"));

        String fullname = employees.stream().findFirst().map(Employee::getFullname).orElse("No Employees found");
        System.out.println(fullname);
    }

}
