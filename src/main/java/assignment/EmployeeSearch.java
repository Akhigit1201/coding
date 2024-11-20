package assignment;

import java.util.*;

public class EmployeeSearch {

    public static void main(String[] args) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        // Sample data
        departmentMap.put("IT", Arrays.asList(new Employee("John", "Doe"), new Employee("Alice", "Smith")));
        departmentMap.put("HR", Arrays.asList(new Employee("Bob", "Brown"), new Employee("Charlie", "Johnson")));
        String searchString = "john";  // The search string (case-insensitive)
        List<Employee> matchingEmployess = searchEmployees(departmentMap, searchString);
        if (matchingEmployess.isEmpty()) {
            System.out.println("No employees found with the matching string");
        } else {
            System.out.println("Matching employees:");
            for (Employee employees : matchingEmployess) {
                    System.out.println(employees);
            }
        }
    }

    public static List<Employee> searchEmployees(Map<String, List<Employee>> departmentMap, String searchString) {
        List<Employee> result = new ArrayList<>();

        String searchLower = searchString.toLowerCase();
        for (List<Employee> employees : departmentMap.values()) {
            for (Employee employee : employees) {
                if (employee.getFirstName().toLowerCase().contains(searchLower) ||
                        employee.getLastName().toLowerCase().contains(searchLower)) {
                    result.add(employee);

                }
            }
        }
        return result;
    }
}

