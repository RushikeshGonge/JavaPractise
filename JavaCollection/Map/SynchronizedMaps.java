package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMaps {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();

        map1.put("1","Naveen");
        map1.put("2","Tom");
        map1.put("3","Lisa");

        //create a synchronized map

        Map<String, String> syncMap = Collections.synchronizedMap(map1);
        System.out.println(syncMap);

        //concurrent map : does not throw any ConcurrentModificationException

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("A","Java");
        concurrentHashMap.put("B","Python");
        concurrentHashMap.put("C","Ruby");

        System.out.println(concurrentHashMap.get("A"));
    }
}
