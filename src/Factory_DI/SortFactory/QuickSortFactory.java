package Factory_DI.SortFactory;

import Factory_DI.Interfaces.ExecuteFactory;
import Factory_DI.Interfaces.Sort;
import Factory_DI.QuickSort.QuickSort;

public class QuickSortFactory implements ExecuteFactory {
    @Override
    public Sort sort(int[] arr) {
        return new QuickSort(arr);
    }
}
