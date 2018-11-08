package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class MillisecondsTest {

    @Test
    fun one_seconds_is_1000_millis() {
        assertEquals(1, 1000.millis.toSeconds)
    }
}
