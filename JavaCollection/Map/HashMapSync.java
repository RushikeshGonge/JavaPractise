package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
    public static void main(String[] args) {
        //HashMap is not synchronized
        //synchronized map method in collection class

        Map<String, String> map1 = new HashMap<String, String >();
        map1.put("Naveen","Java");
        map1.put("Rushi","C++");
        map1.put("Jay","Ruby");

        //create synchronizedMap:
        Map<String, String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap);

        //concurrentHashMap: it does not throw any ConcurrentModificationException
        ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("A","B");
        concurrentMap.put("C","D");
        concurrentMap.put("E","F");

        System.out.println(concurrentMap.get("A"));




    }

}
