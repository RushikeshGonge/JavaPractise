package Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
    public static Map<String,Integer> marksMap;

    static{
        marksMap = new HashMap<>();
        marksMap.put("A", 100);
        marksMap.put("B", 200);
    }

    public static void main(String[] args) {
        //1. using HashMap class

        HashMap<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        //2. static way : static hashmap
       // System.out.println(HashMapInitialization.marksMap.get("A"));

        //3. immutableMap with only one single entry:
       Map<String, Integer> map3 =  Collections.singletonMap("test", 100);
        System.out.println(map3.get("test"));
        // map3.put("abc", 200); //not allowed unsupportedOperationException

        //4. JDK 8;

        Map<String, String> map4 = Stream.of(new String [][]
        {
            {"Tom","A Grade"},
            {"Naveen","A+ Grade"}
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        System.out.println(map4.get("Tom"));

        map4.put("Lisa","A++ Grade");
        System.out.println(map4.get("Lisa"));

        //using SimpleEntry:
       Map<String, String> map6 =  Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Naveen", "Java"),
                new AbstractMap.SimpleImmutableEntry<>("Rushi", "C++")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map6.get("Tom"));
        map6.put("Steve", "Ruby");
        System.out.println(map6.get("Steve"));
        System.out.println(map6.get("Rushi"));

        //JDK 1.9
        //empty map
        Map<String, String> emptyMap = Map.of();
        //  emptyMap.put("Tom","Python");
        // System.out.println(emptyMap.get("Tom"));

        Map<String, String> singletonMap = Map.of("k1","v1");
        System.out.println(singletonMap.get("k1"));
        // singletonMap.put("k2","v2"); not allowed

        //multi values map:
        Map<String, String> multiMap = Map.of("k1","v1","k2","v2","k3","v4");
        System.out.println(multiMap.get("k3"));

        //ofEntries method : no limitations on pairs(key-values)
        Map<String, Integer> map7 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A", 100),
                new AbstractMap.SimpleEntry<>("B", 200),
                new AbstractMap.SimpleEntry<>("C", 300)
                );
        System.out.println(map7.get("C"));
        //map7.put("D",400); UnsupportedOperationException

        //maps using Guava:
        //Map<String, String> titleMaps = ImmtableMap.of



    }
}
