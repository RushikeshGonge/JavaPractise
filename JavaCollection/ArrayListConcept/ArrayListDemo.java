package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        //default class
        //dynamic array

        //int[] i = new int[4];

        //default generics

        ArrayList<Object> ar  = new ArrayList<Object>();
        ar.add(100);
        ar.add(200);
        ar.add("testing");
        ar.add('r');
        ar.add(101.11);
        ar.add(true);

        System.out.println(ar);
       // System.out.println(ar.get(0));
//        System.out.println(ar.getFirst());
//        System.out.println(ar.getLast());
//        System.out.println(ar.get(3));
//        System.out.println(ar.get(2));

        System.out.println(ar.size());

        ar.add("rushikesh");

        System.out.println(ar.size());

        //list with other collection
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
        System.out.println(numbers);

        ArrayList<String> langName = new ArrayList<String>(Arrays.asList("Java","Python","PHP"));
        System.out.println(langName);
        System.out.println(langName.size());



    }
}
