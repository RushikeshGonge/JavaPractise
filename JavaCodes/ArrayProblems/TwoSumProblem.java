import java.util.Map;
import java.util.HashMap;
class TwoSumProblem
{
  static int[] twoSum(int[] arr, int target)
  {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0;i < arr.length;i++)
    {
      map.put(arr[i], i);
    }
    for(int i = 0;i < arr.length;i++)
    {
      int complement = target - arr[i];
      if(map.containsKey(complement) && map.get(complement) != i)
        return new int[] {i, map.get(complement)};
    }
    return new int[] {};
    
  }
  public static void main(String[] args)
  {
    int[] newArr = {1,2,-3,4,-5};
    int k = -8;
    for(int num : twoSum(newArr,k))
    {
      System.out.print(num + " ");
    }
  }
}