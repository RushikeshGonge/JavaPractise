class PushZerosToEnd
{
  static void pushZerosToEnd(int [] nums)
  {
    int n = nums.length;
    int count = 0;
    for(int i = 0;i < n;i++)
    {
      if(nums[i] != 0)
      {
        int temp = nums[i];
        nums[i] = nums[count];
        nums[count] = temp;
        count++;
      }
    }
  }
  public static void main(String [] args)
  {
    int [] arr = {1,0,2,0,3,4,0,9,0,6};
    System.out.println("Before : ");
    for(int num : arr)
    {
      System.out.print(num + " ");
    }
    pushZerosToEnd(arr);
    System.out.println("After : ");
    for(int num : arr)
    {
      System.out.print(num + " ");
    }
  }
}