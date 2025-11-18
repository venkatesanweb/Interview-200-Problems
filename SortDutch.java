import java.util.Arrays;

public class SortDutch {
    
    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
                default:
                    throw new IllegalArgumentException("Array must contain only 0, 1, or 2");
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

   
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        System.out.println("Before: " + Arrays.toString(arr));
        sort012(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}

