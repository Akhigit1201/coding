package assignment;

import java.util.Optional;

public class Employee {

    private Integer id;

    private String firstName;
    private String lastName;
    private String gender;

    private String department;
    private Integer salary;

    public Employee(int id, String firstName, String lastName, String gender, String department, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(int id, String firstName, String lastName, String gender, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(int id, String firstName, String lastName, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullname(){

        return firstName+" " +lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

