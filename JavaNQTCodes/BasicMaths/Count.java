import java.util.ArrayList;
import java.util.Deque;
class CountDigits
{
    int n = 0;
    CountDigits(int num)
    {
        n = num;
    }
    public int countDigits()
    {
        ArrayList<Integer> digitList = new ArrayList<Integer>();
        if(n < 0) n = n * -1;
        if(n >= 0 && n <10) return 1;
        while(n > 0)
        {
            digitList.add(n % 10);
            n = n/10;
        }
        return digitList.size();
    }
}
class Count
{
    public static void main(String[] args) {
        CountDigits obj = new CountDigits(-1);
        System.out.println("Count : " + obj.countDigits());
    }
}