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
    //R2 and R3 Passed!
    @Test
    public void ZeroDays() {
        int days = 0;
        assertEquals("-1",  infection.ZeroDays(-1));
    }
    @Test
    public void Day1() {
        int days = 1;
        assertEquals("numberOfInfectedInstructors = 5",  infection.ZeroDays(days));
    }
    @Test
    public void Day2() {
        int days = 2;
        assertEquals("numberOfInfectedInstructors = 10",  infection.ZeroDays(days));
    }
    @Test
    public void Day3() {
        int days = 3;
        assertEquals("numberOfInfectedInstructors = 15",  infection.ZeroDays(days));
    }
    @Test
    public void Day4() {
        int days = 4;
        assertEquals("numberOfInfectedInstructors = 20",  infection.ZeroDays(days));
    }
    @Test
    public void Day5() {
        int days = 5;
        assertEquals("numberOfInfectedInstructors = 25",  infection.ZeroDays(days));
    }
    @Test
    public void Day6() {
        int days = 6;
        assertEquals("numberOfInfectedInstructors = 30",  infection.ZeroDays(days));
    }
    @Test
    public void Day7() {
        int days = 7;
        assertEquals("numberOfInfectedInstructors = 35",  infection.ZeroDays(days));
    }
    @Test
    public void Day8() {
        int days = 8;
        assertEquals("numberOfInfectedInstructors = 43",  infection.ZeroDays(days));
    }

}