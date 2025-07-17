package ArrayListConcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        //Method 1 : Collections.synchronizedList
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        namesList.add("java");
        namesList.add("python");
        namesList.add("ruby");

        //add,remove --- we do not need explicit synchronization
        //to fetch/traverse the values from the list --- we have to use explicit synchronization

        synchronized (namesList){
            Iterator<String> it = namesList.iterator();

            while (it.hasNext()){
                System.out.println(it.next());
            }

            //Method 2:copyOnWriteArrayList --- it is a class : Thread safe / synchronized already
            CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
            empList.add("Rushi");
            empList.add("Jay");
            empList.add("Tejas");
            empList.add("Pranit");

            //we do not need explicit synchronization for any operation: add/remove/traverse

            Iterator<String> It = empList.iterator();
            while(It.hasNext()){
                System.out.println(It.next());
            }
        }
    }
}
