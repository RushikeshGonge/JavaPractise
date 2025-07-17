package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("Java");
        ar1.add("Python");
        ar1.add("Ruby");
        ar1.add("Javascript");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Testing");
        ar2.add("Dev Ops");

      //  ar1.addAll(ar2);
        //System.out.println(ar1);

//        ar1.addAll(1,ar2);
//        System.out.println(ar1);
//
//        ar1.clear();
//        System.out.println(ar1);

//        ArrayList<String> cloneList = (ArrayList<String>)ar1.clone(); //cone() returns the shallow copy of this arrayList instance
//        System.out.println(cloneList);
//        System.out.println(ar1.contains("python"));
//        System.out.println(ar1.contains("java"));
//        System.out.println(ar1);
//        System.out.println(ar1.indexOf("Ruby")>0);

//        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Naveen","Steve","Lisa","Naveen"));
//        System.out.println(list1);
//        System.out.println(list1.lastIndexOf("Naveen"));
//        System.out.println(list1.lastIndexOf("test"));

//        list1.remove(1);
//        System.out.println(list1);
//
//        list1.remove("Lisa");
//        System.out.println(list1);

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        numbers.removeIf(num -> num%2 == 0);
//        System.out.println(numbers);

//        numbers.removeIf(num -> num%2 == 1);
//        System.out.println(numbers);

//        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Naveen","Peter","Steve","Lisa","Tom"));
//        namesList.retainAll(Collections.singleton("Tom"));
//        System.out.println(namesList);
//        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
//
//        ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2,6));
//        System.out.println(subList);

        ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Naveen","Peter","Steve","Lisa","Tom","Robert"));
        Object[] arr = newList.toArray();
        System.out.println(Arrays.toString(arr));

        for(Object obj:arr)
        {
            System.out.println((String) obj);
        }



    }
}
