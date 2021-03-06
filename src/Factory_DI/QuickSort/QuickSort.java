package Factory_DI.QuickSort;

import java.util.Arrays;

import Factory_DI.Interfaces.Sort;

public class QuickSort extends PartionIt implements Sort {
    private int[] tempArr = new int[0];

    public QuickSort(int[] unsortedArr) {
        int length = unsortedArr.length;
        this.tempArr = Arrays.copyOf(unsortedArr, length);
    }
    @Override
    public void makeSort(int... values) {
        int leftBound = values[0];
        int rightBound = values[1];
        if (rightBound - leftBound >= 0) {
            int pivot = tempArr[rightBound];

            int part = partionIt(tempArr, leftBound, pivot, rightBound);
            makeSort(leftBound, part - 1);
            makeSort(part + 1, rightBound);
        }
    }

    public int[] getSortedArr() {
        return tempArr;
    }
}
