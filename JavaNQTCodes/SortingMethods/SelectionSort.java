class SelectionSort
{
  static void selectionSort(int [] arr)
  {
    int n = arr.length;
    for(int i = 0;i < n-1;i++)
    {
      int minIndex = i;
      for(int j = i + 1;j < n;j++)
      {
        if(arr[j] < arr[minIndex]) minIndex = j;
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  public static void main(String[] args)
  {
    int[] newArr = {12,1,4,3,11};
    System.out.println("Array before : ");
    for(int ele : newArr)
    {
    System.out.print(ele + " ");
    }
    selectionSort(newArr);
    System.out.println(); 
    System.out.println("Array after : ");
    for(int ele : newArr)
    {
    System.out.print(ele + " ");
    }
    
  }
}