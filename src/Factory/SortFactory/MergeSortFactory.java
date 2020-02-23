package Factory.SortFactory;

import Factory.Interfaces.ExecuteFactory;
import Factory.Interfaces.Sort;
import Factory.MergeSort.MergeSort;

public class MergeSortFactory implements ExecuteFactory {
    @Override
    public Sort sort(int[] arr) {
        return new MergeSort(arr);
    }
}
