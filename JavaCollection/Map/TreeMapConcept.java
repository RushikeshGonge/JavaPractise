package Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1000, "Tom");
        map.put(2000, "Peter");
        map.put(3000, "Steve");
        map.put(11000, "Naveen");
        map.put(1400, "Robby");

        System.out.println(map);
        map.forEach((k,v) -> System.out.println("Key = " + k + " value = " + v));

        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        Set<Integer> lessThanKeys =  map.headMap(3000).keySet();  //returns set of keys less than 3000 (input key) ----headMap() --> toKey
        System.out.println(lessThanKeys);

        Set<Integer> greaterThanKeys = map.tailMap(3000).keySet(); //returns set of keys greater than or equal to 3000 (input key) ------tailMap -->fromKey
        System.out.println(greaterThanKeys);

        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.put(1000, "Tom");
        map1.put(2000, "Peter");
        map1.put(3000, "Steve");
        map1.put(11000, "Naveen");
        map1.put(1400, "Robby");

        System.out.println(map1);




    }
}
