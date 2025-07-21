public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left and right
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // pivot = last element
        int i = low - 1;

        // Move elements smaller than pivot to left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        // Place pivot in the correct position
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;

        return i + 1; // pivot index
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 5};
        quickSort(arr, 0, arr.length - 1);

        for (int n : arr) System.out.print(n + " ");
    }
}
