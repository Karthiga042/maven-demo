package com.karthiga.regression;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Regression test for App.java.
 */
public class AppTest {

    private App app;

    @BeforeEach
    void setup() {
        app = new App();
    }

    @Test
    void testMessageShouldBeCorrect() {
        String expected = "Hello from Maven Regression Project!";
        String actual = app.getMessage();
        Assertions.assertEquals(expected, actual, "Message should match expected output");
    }

    @Test
    void testMessageShouldNotBeNull() {
        Assertions.assertNotNull(app.getMessage(), "Message should not be null");
    }
}
