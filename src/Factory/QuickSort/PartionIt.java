package Factory.QuickSort;

public class PartionIt {
    protected int partionIt(int[] arr, int leftBound, int pivot, int rightBound) {
        int leftPtr = leftBound - 1;
        int rightPtr = rightBound;
        while (true) {
            while (arr[++leftPtr] < pivot)
                ;
            while (rightPtr > 0 && arr[--rightPtr] > pivot)
                ;
            if (leftPtr >= rightPtr)
                break;
            else {
                int[] tempLR = Utils.swap(arr, leftPtr, rightPtr);
                leftPtr = tempLR[0];
                rightPtr = tempLR[1];
            }
        }
        int[] tempLR = Utils.swap(arr, leftPtr, rightBound);
        leftPtr = tempLR[0];
        return leftPtr;
    }
}
