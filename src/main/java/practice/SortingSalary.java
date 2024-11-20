package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

    public class SortingSalary {


        public static void main(String[] args) {

            List<Employee> employees = Arrays.asList(new Employee("Akhila", 80000),
                    new Employee("Robert", 100000),
                    new Employee("Cap", 87000),
                    new Employee("Black", 20000));

            List<Employee> sortedEmployees = employees.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .collect(Collectors.toList());

            sortedEmployees.forEach(System.out::println);
        }
    }

