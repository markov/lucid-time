package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class MinutesTest {

    @Test
    fun half_minute_is_30_sec() {
        assertEquals(30.seconds, 0.5.minutes.asSeconds)
    }
}
