package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        //no order -- no indexing
        //stores values -- key-value <k,v>
        //key can not be duplicated
        //can store n number of null values but only one null key
        //hashmap is not thread-safe -- unsynchronized

        HashMap<String,String> capitalMap = new HashMap<String,String>();

        capitalMap.put("India","New Delhi");
        capitalMap.put("USA","Washington DC");
        capitalMap.put("UK","London");
        capitalMap.put("UK","New London");
        capitalMap.put(null,"Berlin");
        capitalMap.put("Germany",null);
        capitalMap.put("Italy",null);
        capitalMap.remove("UK");


//        System.out.println(capitalMap.get("USA"));
//        System.out.println(capitalMap.get("India"));
//        System.out.println(capitalMap.get("UK")); // gives only the latest value for the key that means duplicacy is not allowed
//        System.out.println(capitalMap.get("Italy"));
//        System.out.println(capitalMap.get("Germany"));
//        System.out.println(capitalMap.get(null));

        //iterator: over the keySet()
        Iterator<String> it = capitalMap.keySet().iterator();

        while(it.hasNext())
        {
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("Key = " + key + " value = " + value);
        }
        System.out.println("---------------");

        //iterator: over the set(pair) : by using entrySet()
        Iterator<Map.Entry<String,String>> it1 = capitalMap.entrySet().iterator();

        while(it1.hasNext())
        {
            Map.Entry<String,String> entry = it1.next();
            System.out.println("key = " + entry.getKey() + " and value " + entry.getValue());
        }

        System.out.println("--------------");

        //iterate hashmap using java 8 for each and lambda:
        capitalMap.forEach((k,v) -> System.out.println("key =  " + k + " and value = " + v));

    }
}
