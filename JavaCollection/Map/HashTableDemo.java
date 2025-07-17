package Map;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();

        marks.put("Naveen", 100);
        marks.put("Tom", 200);
        marks.put("Lisa", 300);
        marks.put("Peter", 400);
        marks.put("Robby", 500);
       // marks.put(null, 600); //not allowed in hashtable
        //marks.put("Rushi",null); //also not allowed
        System.out.println(marks);
        System.out.println(marks.get("Naveen"));
//        System.out.println(marks.get(null)); //NullPointerException
//        System.out.println(marks.get("Rushi")); //NullPointerException


    }
}
