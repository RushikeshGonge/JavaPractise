class MinMax{
  static int[] minMax(int [] arr)
  {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int [] arr1 = new int[2];
    for(int i = 0;i < arr.length;i++)
    {
      if(arr[i] > max) max = arr[i];
      if(arr[i] < min) min = arr[i];
    }
    arr1[0] = min;
    arr1[1] = max;
    return arr1;
  }
  public static void main(String[] args)
  {
    int [] arr =  {11,12,13,43,23,1};
   // System.out.println(minMax(arr)); arrays can not be directly printed
    int [] arr1 = minMax(arr);
    for(int ele : arr1)
    {
      System.out.println(ele);
    }
  }
}