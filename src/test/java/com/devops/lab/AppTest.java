package com.devops.lab;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void bottleneckScenario() {
        assertTimeoutPreemptively(Duration.ofMillis(500), () -> Thread.sleep(2000));
    }
}
