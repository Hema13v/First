package com.test.oce_mise_test;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
