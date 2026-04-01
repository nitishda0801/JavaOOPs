package streamAPICodingQuestions;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}
public class HighestSalaryInDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Nitish", "IT", 90000),
                new Employee("Aryan", "IT", 95000),
                new Employee("Rohit", "HR", 60000),
                new Employee("Sita", "HR", 85000),
                new Employee("Arjun", "Finance", 120000)
        );

        Map<String, Optional<Employee>> highestSalaryInDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highestSalaryInDept);

        //count in each department
        //method 1
        Map<String,Long> empCountInDept = employees.stream()
                .collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
        //method 2
//        Map<String,Integer> empCountInDept = employees.stream()
//                .collect(Collectors.groupingBy(e->e.department,Collectors.summingInt(e->1)));
        System.out.println(empCountInDept);

        Map<String,List<String>> sortEmpByDept= employees.stream()
                .collect(Collectors.groupingBy(e->e.department,Collectors.mapping(e->e.name,Collectors.toList())));

        System.out.println(sortEmpByDept);


    }
}
