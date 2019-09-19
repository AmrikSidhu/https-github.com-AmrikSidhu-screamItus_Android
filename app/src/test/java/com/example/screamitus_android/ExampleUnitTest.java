package com.example.screamitus_android;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
Infection infection;

    @Before
    public void setUp() throws Exception {
        infection = new Infection();
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void ZeroDays() {
        int days = 0;
        assertEquals("Days",  infection.ZeroDays(-1));
    }

}