class SecLarSecSmallest
{
  static int[] secMinMax(int [] arr)
  {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    int secMax = Integer.MIN_VALUE;
    int secMin = Integer.MAX_VALUE;
    
    int [] arr1 = new int[2];
    for(int i = 0;i < arr.length;i++)
    {
      if(arr[i] > max) 
      {
        secMax = max;
        max = arr[i];
      }
      else if(arr[i] > secMax && arr[i] != max) secMax = arr[i];
      
      if(arr[i] < min)
      {
        secMin = min;
        min = arr[i];
      }
      else if(arr[i] < secMin && arr[i] != min) secMin = arr[i];
      
    }
    
    arr1[0] = secMin;
    arr1[1] = secMax;
    return arr1;
 }

  
  
  public static void main(String[] args)
  {
    int [] arr =  {11,12,13,43,23,1};
   // System.out.println(minMax(arr)); arrays can not be directly printed
    int [] arr1 = secMinMax(arr);
    for(int ele : arr1)
    {
      System.out.println(ele);
    }
  }
}

