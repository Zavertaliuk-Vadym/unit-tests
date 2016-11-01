package com.in6k.tests.first;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelfVerifyingPrincipleTest {
    @Test
    public void doNotUseConsoleLoggingForManualResultTests() throws Exception {
        int result = 2 + 2;
        assertEquals(4, result);
    }
}
