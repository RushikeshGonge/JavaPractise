import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShopCloseOrNot {
    public static void toCloseORNOt(ArrayList<String> entryList)
    {
       // int length = entryList.size();
        boolean flag = true;
        for(String str: entryList)
        {
            if(Collections.frequency(entryList,str) % 2 != 0){
                flag = false;
                System.out.println("Wait to leave!");
                break;
            }
        }
        if(flag) System.out.println("Good to close!");
    }
    public static void main(String [] args)
    {
        ArrayList<String> newList = new ArrayList<String>(Arrays.asList("Alice","Bob","Tom","Bob","Alice"));
        toCloseORNOt(newList);
    }

}
