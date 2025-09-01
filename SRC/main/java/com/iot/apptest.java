package com.iot;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAddNumbers() {
        App app = new App();
        assertEquals(5, app.addNumbers(2, 3));
    }
}
