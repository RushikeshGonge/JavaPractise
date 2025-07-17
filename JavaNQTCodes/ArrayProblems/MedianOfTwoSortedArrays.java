import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class MedianOfTwoSortedArrays {
  
  static double median(int[] nums1, int[] nums2) {
    ArrayList<Integer> arr = new ArrayList<>();

    // Sort the input arrays first if not already sorted
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    // Merge the arrays
    mergeArrays(nums1, nums2, arr);

    int n = arr.size();
    if (n % 2 != 0)
      return arr.get(n / 2);  // odd length
    else
      return (arr.get(n / 2) + arr.get(n / 2 - 1)) / 2.0;  // even length
  }

  static void mergeArrays(int[] nums1, int[] nums2, ArrayList<Integer> result) {
    int p1 = 0, p2 = 0;
    int n1 = nums1.length, n2 = nums2.length;

    while (p1 < n1 && p2 < n2) {
      if (nums1[p1] < nums2[p2]) {
        result.add(nums1[p1++]);
      } else {
        result.add(nums2[p2++]);
      }
    }

    while (p1 < n1) {
      result.add(nums1[p1++]);
    }

    while (p2 < n2) {
      result.add(nums2[p2++]);
    }
  }

  public static void main(String[] args) {
    int[] arr1 = {2, 1, 3, 5};
    int[] arr2 = {4, 8, 6, 7, 9};

    System.out.println("Median of the sorted array is: " + median(arr1, arr2));
  }
}
