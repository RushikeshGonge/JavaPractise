import java.util.Scanner;
public class table {
    static float avg(int[] array)
    {
        int sum=0;
        for(int i = 0;i<array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println(sum);
        return (float)sum/array.length;
    }
        public static void main(String[] args) {
        int[] arr = {12,23,43,45};
        System.out.println(avg(arr));
    }
}
