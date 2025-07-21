class Sort012 {
    static void sort012(int[] arr)
    {
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0)
            {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] newArr = {0,1,1,1,0,0,0,2,2,2,0,1};
        sort012(newArr);
        for(int ele : newArr)
        {
            System.out.print(ele + " ");
        }
    }
}

