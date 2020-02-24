package Factory_DI.MergeSort;

public class Merge {
    protected void merge(int[] tempArr, int[] resArr, int leftBound, int mid, int rightBound) {
        int left = leftBound;
        int pivot = mid + 1;
        int n = rightBound - leftBound + 1;
        int i = 0;
        while (leftBound <= mid && pivot <= rightBound) {
            if (resArr[leftBound] < resArr[pivot])
                tempArr[i++] = resArr[leftBound++];
            else if (resArr[leftBound] > resArr[pivot])
                tempArr[i++] = resArr[pivot++];
            else {
                tempArr[i++] = resArr[leftBound++];
                tempArr[i++] = resArr[pivot++];
            }
        }
        while (leftBound <= mid)
            tempArr[i++] = resArr[leftBound++];
        while (pivot <= rightBound)
            tempArr[i++] = resArr[pivot++];
        for (i = 0; i < n; i++)
            resArr[left + i] = tempArr[i];
    }
}
