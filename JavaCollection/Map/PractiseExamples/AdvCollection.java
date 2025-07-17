package Map.PractiseExamples;

import java.util.*;
import java.util.stream.Collectors;

class Department {
    String name;
    Department(String name) { this.name = name; }

    public String getName() { return name; }

    @Override
    public String toString() {
        return name;
    }
}

class Employee {
    String name;
    int salary;
    Department department;

    Employee(String name, int salary, Department department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Department getDepartment() { return department; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

public class AdvCollection {
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Department tech = new Department("Tech");
        Department test = new Department("Test");

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000, hr),
                new Employee("Bob", 70000, tech),
                new Employee("Charlie", 60000, hr),
                new Employee("David", 80000, tech),
                new Employee("Naveen",76000,test),
                new Employee("Rushikesh",90000,test)
        );

        Map<Department, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        byDept.forEach((dept, list) -> {
            System.out.println(dept.getName() + ": " + list);

        });

        Map<Department, Integer> totalByDept = employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.summingInt(Employee :: getSalary)));

        totalByDept.forEach((dept, total) -> {
            System.out.println(dept.getName() + " total salary : $" + total);
        });
    }
}
