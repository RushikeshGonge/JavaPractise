package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,2,1,4,5,6,7,6,5,4,8));

        //1.LinkedHashSet

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
        System.out.println(linkedHashSet);
        ArrayList<Integer> numbersWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
        System.out.println(numbersWithoutDuplicates);

        //2. JDK 8 - stream:

        ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,7,6,5,4,3,2,12,12,1));
        List<Integer> marksUnique = markList.stream().distinct().collect(Collectors.toList());
        System.out.println(marksUnique);
    }
}
