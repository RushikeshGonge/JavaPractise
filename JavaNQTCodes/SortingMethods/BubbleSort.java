class BubbleSort
{
  static void bubbleSort(int[] arr)
  {
    int n = arr.length;
    for(int i = 0;i < n;i++)
    {
      for(int j = 0;j < n - i - 1;j++)
      {
        if(arr[j]  > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
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
    bubbleSort(newArr);
    System.out.println(); 
    System.out.println("Array after : ");
    for(int ele : newArr)
    {
    System.out.print(ele + " ");
    }
  }
}