import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class sample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,6));

        ArrayList<Integer> cloneList = (ArrayList<Integer>) list.clone();
       // System.out.println(cloneList);

        Object[] obj = cloneList.toArray();

        String numString = obj.toString();
       
      
        

        //newList = Arrays.asList(obj);
        // for(Object num : obj)
        // {
        //     System.out.print(num + " ");
        // }
        // list.stream().forEach(num -> System.out.println(num));

        // for(int i = 0; i < list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }

        // for(int num : list)
        // {
        //     System.out.print(num + " ");
        // }

        // Iterator<Integer> it = list.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
            
        // }
            
       

    }
    
}
