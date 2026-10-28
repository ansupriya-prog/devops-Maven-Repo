package com.devops.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void additionWorks() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void stringConcatWorks() {
        assertEquals("DevOps Lab", "DevOps" + " " + "Lab");
    }
}
