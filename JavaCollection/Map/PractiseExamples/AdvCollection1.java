package Map.PractiseExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student
{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }

    public String toString(){
        return name + " (" + marks + " )";
    }
}
public class AdvCollection1 {
    public static void main(String[] args) {
        int PASS_THRESHOLD = 50;

        List<Student> students = Arrays.asList(
                new Student("Tom",80),
                new Student("Sam",40),
                new Student("Lisa",70),
                new Student("John",30)
        );

        Map<Boolean, List<Student>> passingFailing = students.stream().collect(Collectors.partitioningBy(s -> s.getMarks() >= PASS_THRESHOLD));

        System.out.println("Passing : " + passingFailing.get(true));
        System.out.println("Failing : " + passingFailing.get(false));
    }
}
