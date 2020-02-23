package Factory;

import Factory.Interfaces.ExecuteFactory;

public class AppFactoryWithSpeedTest extends AppFactory {
    private int TEST_COUNT;
    private long timeDiff = 0;

    public AppFactoryWithSpeedTest(ExecuteFactory sf, int[] unsortedArr, int TEST_COUNT) {
        super(sf, unsortedArr);
        this.TEST_COUNT = TEST_COUNT;
    }

    private void speedTest(int TEST_COUNT) {
        if (TEST_COUNT > 0) {
            long start = System.currentTimeMillis();
            exec();
            timeDiff += System.currentTimeMillis() - start;
            speedTest(--TEST_COUNT);
        }
    }

    public int ETA() {
        speedTest(TEST_COUNT);
        return (int) timeDiff / TEST_COUNT;
    }
}
