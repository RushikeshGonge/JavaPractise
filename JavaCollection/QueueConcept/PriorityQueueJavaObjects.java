package QueueConcept;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee [name = " + name + ", salary = " + salary + "]";

    }
}
class EmpComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.salary - e1.salary;
    }
}
public class PriorityQueueJavaObjects {
    public static void main(String[] args) {
        EmpComparator comparator = new EmpComparator();

        PriorityQueue<Employee> priorityQueue =new PriorityQueue<Employee>(10,comparator);

        priorityQueue.add(new Employee("A", 300));
        priorityQueue.add(new Employee("B", 200));
        priorityQueue.add(new Employee("C", 4000));
        priorityQueue.add(new Employee("D", 50));
        priorityQueue.add(new Employee("E", 10));
        priorityQueue.add(new Employee("F", 3500));
        priorityQueue.add(new Employee("G", 50000));

        System.out.println(priorityQueue.poll()); //remove the extreme value
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);
    }
}
