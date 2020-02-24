package Utils;

import Factory_DI.Interfaces.ExecuteFactory;
import Factory_DI.Interfaces.Realize;

public class SpeedTest {
    private Realize realize;
    private int ARRAY_LENGTH = 0;
    private int TEST_COUNT = 0;

    public SpeedTest(Realize realize, int ARRAY_LENGTH, int TEST_COUNT) {
        this.realize = realize;
        this.ARRAY_LENGTH = ARRAY_LENGTH;
        this.TEST_COUNT = TEST_COUNT;
    }

    public void invoke(ExecuteFactory sf, int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < TEST_COUNT; i++)
            realize.exec(sf, arr, ARRAY_LENGTH, TEST_COUNT);
        long res = System.currentTimeMillis() - start;
        System.out.printf("Time for sort (%d) = %.2f sec.\n", ARRAY_LENGTH, (double) (res / TEST_COUNT) / 1000);
    }
}
