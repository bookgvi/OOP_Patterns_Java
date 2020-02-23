package Factory.Interfaces;

public interface Sort {
    void makeSort(int[] arr, int... values);

    int[] getSortedArr();
}
