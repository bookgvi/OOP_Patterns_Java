package Utils;

public class ArrayCreate {
    public static int[] UnsortedArray(int ARRAY_LENGTH) {
        int[] arr = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++)
            arr[i] = (int) (Math.random() * ARRAY_LENGTH + 1);
        return arr;
    }
}
