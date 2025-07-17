package LinkedListConcepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
         //important notes
        /* 1. LL is a default class in java
           2. It can be used as List, Stack, Queue
           3. It allows the null entry
           4. It is a dynamic collection
           5. hence insertion and deletion can be easily implemented
           6. It can contain duplicate elements
           7. It is not synchronized (not thread safe)
           8. In LL, manipulation is fast because we don't need any shifting.

       */
        //LL constructors:
        //LinkedList();
        //LinkedList(Collection c);

        LinkedList<String> names = new LinkedList<String>();
       // System.out.println(names.size());
        names.add("Tom");//0
        names.add("Naveen");//1
        names.add("Robby");//2
        names.add("Lisa");//3
//        System.out.println(names.size());
//
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
        //System.out.println(names.get(2)); //IndexOutOfBoundsException


//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        names.add(4,"Steve");
      //  System.out.println(names.get(4));

        names.add(2,"Ram");
        Iterator<String> it = names.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        //System.out.println(names.get(2));
        //System.out.println(names);
//
//        LinkedList<String> users = new LinkedList<String>();
//
//        users.add("Peter");
//        users.add("Trump");
//
//        names.addAll(users);
//        users.addAll(names);
//        System.out.println(users);
//        names.addFirst("Kamala");
//        System.out.println(names);
//        names.addLast("Shivin");
//        System.out.println(names);
//        //System.out.println(names);

        //remove elements
//
//        names.remove(2);
//        System.out.println(names);
//
//        names.removeAll(users);
//        System.out.println(names);
//
//        names.removeFirst();
//        System.out.println(names);
//
//        names.removeLast();
//        System.out.println(names);
//
//        System.out.println(users);
//        users.clear();
//        System.out.println(users);
//
        LinkedList<String> lang = new LinkedList<String>();
        System.out.println(lang.size());

        lang.add("Java");
        lang.add("Python");
        lang.add("Ruby");
        lang.add("JavaScript");

        System.out.println(lang.size());
        System.out.println(lang);
        //reversing the LinkedList
        Iterator<String> itr = lang.descendingIterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        for(String e : lang){
            System.out.println(e);
        }

        //sorting;
        Collections.sort(lang);
        System.out.println(lang);












    }
}
