package Factory.QuickSort;

public class Utils {
    public static int[] swap(int[] arr, int left, int right) {
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];
        return new int[]{ left, right };
    }
}
