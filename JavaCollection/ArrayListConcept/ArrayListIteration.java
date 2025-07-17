package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String > studentList =  new ArrayList<String>();
        studentList.add("Tom");
        studentList.add("Naveen");
        studentList.add("Steve");
        studentList.add("Lisa");

        //typical for loop
        for (int i=0; i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
        System.out.println("--------------");
        //for each loop
        for(String name:studentList)
        {
            System.out.println(name);
        }
        System.out.println("--------------");
        //lambda
        studentList.stream().forEach(ele -> System.out.println(ele));
        System.out.println("--------------");
        //iterator
        Iterator<String> it = studentList.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
