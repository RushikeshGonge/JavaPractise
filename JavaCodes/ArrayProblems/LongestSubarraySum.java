import java.util.Map;
import java.util.HashMap;
class LongestSubarraySum
{
  static int longestSubarraySum(int [] arr, int k)
  {
    Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
    int res = 0;
    int prefSum = 0;
    
    for(int i = 0;i < arr.length;i++)
    {
      prefSum += arr[i];
      
      if(prefSum == k);
        res = i + 1;
        
      if(mp.containsKey(prefSum - k))
      {
        res = Math.max(res, i - mp.get(prefSum - k));
      }
      if(!mp.containsKey(prefSum))
        mp.put(prefSum, i);
        
    }
    return res;
  }
  
  public static void main(String[] args)
  {
    int [] arr = {10, 5, 2, 7, 1, -10};
    int k = 15;
    for(int num : arr)
    {
      System.out.print(num + "  ");
    }
    System.out.println(" : Longest sub array length --> " + longestSubarraySum(arr,k));
  }
}