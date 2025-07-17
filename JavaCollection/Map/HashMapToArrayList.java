package Map;

import java.util.*;

public class HashMapToArrayList {
    public static void main(String[] args) {

        HashMap<String, Integer> compMap = new HashMap<String, Integer>();

        compMap.put("Google",10000);
        compMap.put("Walmart",20000);
        compMap.put("Amazon",30000);
        compMap.put("Facebook",5000);
        compMap.put("Cisco",15000);

        System.out.println("Company map size: " + compMap.size());

        Iterator it = compMap.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());

        }

        //convert hashmap keys into ArrayList:
        List<String> compNamesList =  new ArrayList<String>(compMap.keySet());
        System.out.println("Total comp count : " + compNamesList.size());
        for(String t  : compNamesList)
        {
            System.out.println(t);
        }

        //convert hashmap values into ArrayList:
        List<Integer> EmpValuesList = new ArrayList<Integer>(compMap.values());
        System.out.println("Total emp values count : " + EmpValuesList.size());
        for(Integer e : EmpValuesList)
        {
            System.out.println(e);
        }


    }
}
