package test1;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test06PerformanceTest {

    @Test
    void testPerformanceSumOperation() {

        assertTimeout(Duration.ofMillis(6),
                () -> {
                    long sum = 0;
                    for (long i = 1; i < 10000000; i++) {
                        sum += i;
                    }

                });


    }
}

 //