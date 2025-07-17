package ArrayListConcept;
import java.util.ArrayList;
public class VirtualCapacity {
    public static void main(String[] args) {

        //default virtual capacity = 10 but we can initialize it with other values
        ArrayList<Object> ar = new ArrayList<Object>(20); //we can initialize the virtual capacity
        System.out.println(ar.size()); // physical capacity
        ar.add(100);
        System.out.println(ar.size()); // pc = 1
        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size()); // pc = 4

    }
}
