package Factory_DI;

import Factory_DI.Interfaces.ExecuteFactory;
import Factory_DI.Interfaces.Sort;

public class AppFactory {
    private Sort sort;
    private int[] unsortedArr;

    public AppFactory(ExecuteFactory sf, int[] unsortedArr) {
        sort = sf.sort(unsortedArr);
        this.unsortedArr = unsortedArr;
    }

    public void exec() {
        sort.makeSort( 0, this.unsortedArr.length - 1);
    }

    public int[] getArr() {
        return sort.getSortedArr();
    }
}
