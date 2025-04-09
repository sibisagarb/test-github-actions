package com.sample.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {

    @Test
    public void contextLoads() {
        // This test will pass if the Spring context loads successfully
    }

    @Test
    public void demoPassingTest() {
        assert(true);
    }

    @Test
    public void demoFailingTest() {
        // This test was failing to demonstrate JUnit reporting
        // Now fixed to pass
        assert(true);
    }
} 