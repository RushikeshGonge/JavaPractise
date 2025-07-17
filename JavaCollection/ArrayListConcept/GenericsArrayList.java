package ArrayListConcept;

import java.util.ArrayList;

public class GenericsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> markList = new ArrayList<Integer>();

        markList.add(100);
        //markList.add(12.33); // not allowed because markList is of integer type

        ArrayList<Double> arD = new ArrayList<Double>();
        arD.add(100.0);
        arD.add(12.33);

        ArrayList<String> studentNames = new ArrayList<String>();
    }
}
