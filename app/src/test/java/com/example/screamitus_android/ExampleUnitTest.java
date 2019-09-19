// Student Name : Amrik Singh Sidhu
// Student ID: C0742318


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
    // check if zeros days the error message must be "-1"
    @Test
    public void ZeroDays() {
        int days = 0;
        assertEquals("-1",  infection.ZeroDays(-1));
    }

    @Test
    public void DysUpToSeven() {
        int days = 1;
        assertEquals("numberOfInfectedInstructors = 5",  infection.ZeroDays(days));
    }

}