package DI;

import java.util.Arrays;

public class MergeSort implements Execute<int[]> {
    private int[] tempArr;
    private int[] sortedArr;

    public MergeSort(int[] unsortedArray) {
        int length = unsortedArray.length;
        this.sortedArr = Arrays.copyOf(unsortedArray, length);
        this.tempArr = new int[length];
    }

    private void makeSort(int[] tempArr, int leftBound, int rightBound) {
        if (leftBound != rightBound) {
            int mid = (rightBound + leftBound) / 2;
            makeSort(tempArr, leftBound, mid);
            makeSort(tempArr, mid + 1, rightBound);
            merge(tempArr, leftBound, mid, rightBound);
        }
    }

    private void merge(int[] tempArr, int leftBound, int mid, int rightBound) {
        int left = leftBound;
        int pivot = mid + 1;
        int n = rightBound - leftBound + 1;
        int i = 0;
        while (leftBound <= mid && pivot <= rightBound) {
            if (sortedArr[leftBound] < sortedArr[pivot])
                tempArr[i++] = sortedArr[leftBound++];
            else if (sortedArr[leftBound] > sortedArr[pivot])
                tempArr[i++] = sortedArr[pivot++];
            else {
                tempArr[i++] = sortedArr[leftBound++];
                tempArr[i++] = sortedArr[pivot++];
            }
        }
        while (leftBound <= mid)
            tempArr[i++] = sortedArr[leftBound++];
        while (pivot <= rightBound)
            tempArr[i++] = sortedArr[pivot++];
        for (i = 0; i < n; i++) {
            sortedArr[left + i] = tempArr[i];
        }
    }

    @Override
    public int[] exec() {
        makeSort(tempArr, 0, tempArr.length - 1);
        return this.sortedArr;
    }
}
