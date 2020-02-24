package Factory_DI.QuickSort;

public class Utils {
    public static void swap(int[] arr, int left, int right) {
       int temp = arr[left];
       arr[left] = arr[right];
       arr[right] = temp;
    }
}
