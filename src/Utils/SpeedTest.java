package Utils;

import DI.Execute;

public class SpeedTest<T> {
    private int TEST_COUNT;

    public SpeedTest(int TEST_COUNT) {
        this.TEST_COUNT = TEST_COUNT;
    }

    private long speedTest(Execute<T> execute) {
        long start = System.currentTimeMillis();
        execute.exec();
        return System.currentTimeMillis() - start;
    }

    public long exec(Execute<T> execute) {
        long result = 0;
        for (int i = 0; i < TEST_COUNT; i++)
            result += this.speedTest(execute);
        return result;
    }
}
