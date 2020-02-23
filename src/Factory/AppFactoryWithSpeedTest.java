package Factory;

import Factory.SortFactory.MergeSortFactory;

public class AppFactoryWithSpeedTest extends AppFactory {
    private int TEST_COUNT;
    private long timeDiff = 0;

    public AppFactoryWithSpeedTest(MergeSortFactory msf, int[] unsortedArr, int TEST_COUNT) {
        super(msf, unsortedArr);
        this.TEST_COUNT = TEST_COUNT;
    }

    private long speedTest(int TEST_COUNT) {
        if (TEST_COUNT > 0) {
            long start = System.currentTimeMillis();
            exec();
            timeDiff += System.currentTimeMillis() - start;
            speedTest(--TEST_COUNT);
        }
        return timeDiff;
    }

    public int ETA() {
        speedTest(TEST_COUNT);
        return (int) timeDiff / TEST_COUNT;
    }
}
