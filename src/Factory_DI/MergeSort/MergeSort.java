package Factory_DI.MergeSort;

import java.util.Arrays;

import Factory_DI.Interfaces.Sort;

public class MergeSort extends Merge implements Sort {
    private int[] tempArr;
    protected int[] resArr;

    public MergeSort(int[] unsortedArr) {
        int length = unsortedArr.length;
        this.resArr = Arrays.copyOf(unsortedArr, length);
        tempArr = new int[length];
    }

    @Override
    public void makeSort(int... values) {
        int leftBound = values[0];
        int rightBound = values[1];
        if (leftBound != rightBound) {
            int mid = (rightBound + leftBound) / 2;
            makeSort(leftBound, mid);
            makeSort(mid + 1, rightBound);
            merge(tempArr, resArr, leftBound, mid, rightBound);
        }
    }

    public int[] getSortedArr() {
        return resArr;
    }

}
