package Factory_DI.SortFactory;

import Factory_DI.Interfaces.ExecuteFactory;
import Factory_DI.Interfaces.Sort;
import Factory_DI.MergeSort.MergeSort;

public class MergeSortFactory implements ExecuteFactory {
    @Override
    public Sort sort(int[] arr) {
        return new MergeSort(arr);
    }
}
