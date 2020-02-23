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
                Utils.swap(arr, leftPtr, rightPtr);
            }
        }
        Utils.swap(arr, leftPtr, rightBound);
        return leftPtr;
    }
}
