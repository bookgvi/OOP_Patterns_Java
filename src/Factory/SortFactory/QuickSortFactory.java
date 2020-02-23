package Factory.SortFactory;

import Factory.Interfaces.ExecuteFactory;
import Factory.Interfaces.Sort;
import Factory.QuickSort.QuickSort;

public class QuickSortFactory implements ExecuteFactory {
    @Override
    public Sort sort(int[] arr) {
        return new QuickSort(arr);
    }
}
