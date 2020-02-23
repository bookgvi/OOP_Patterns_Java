package Factory;

import Factory.Interfaces.Sort;
import Factory.SortFactory.MergeSortFactory;

public class AppFactory {
    private Sort sort;
    private int[] unsortedArr;

    public AppFactory(MergeSortFactory msf, int[] unsortedArr) {
        sort = msf.sort(unsortedArr);
        this.unsortedArr = unsortedArr;
    }

    public void exec() {
        sort.makeSort(this.unsortedArr, 0, this.unsortedArr.length - 1);
    }

    public int[] getArr() {
        return sort.getSortedArr();
    }
}
