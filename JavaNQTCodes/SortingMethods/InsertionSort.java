class InsertionSort
{
    static void insertionSort(int[] arr)
    {
      int n = arr.length;
      for(int i = 1;i < n;i++)
      {
        int key = arr[i];
        int j = i - 1;
        while(j >= 0 && arr[j] > key)
        {
          arr[j + 1] = arr[j];
          j--;
        }
        arr[j + 1] = key;
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
    insertionSort(newArr);
    System.out.println(); 
    System.out.println("Array after : ");
    for(int ele : newArr)
    {
    System.out.print(ele + " ");
    }
    }
  
}