class SelectionSort
{
  static void selectionSort(int[] arr)
  {
    int length = arr.length;
    for(int i = 0;i < length - 1;i++)
    {
      int min_index = i;
      for(int j = i + 1;j < length;j++)
      {
        if(arr[j] < arr[min_index]) min_index = j;
      }
      int temp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index] = temp;
    }
  }
  public static void main(String[] args)
  {
    int[] arr1 = {12,23,32,9,2,44};
    System.out.println("Original Array :");
    for(int i : arr1)
    {
      System.out.print(i + " ");
    }
    selectionSort(arr1);
    System.out.println();
    System.out.println("Sorted Array :");
     for(int i : arr1)
    {
      System.out.print(i + " ");
    }
    
  }
}