class RotateArrayRight
{
  public static int[] rotateArrayRight(int[] nums, int k)
  {
    int len = nums.length;
    k = k % len;
    
    reverse(nums, 0, len - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, len - 1);
    
    return nums;
  }
  
  private static void reverse(int[] arr, int start, int end)
  {
    while(start < end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
    }
  }
  
  public static void main(String [] args)
  {
    int[] arr = {0,1,2,3,4};
    int [] newArr = rotateArrayRight(arr,2);
    for(int num : newArr)
    {
      System.out.println(num);
    }
  }
}