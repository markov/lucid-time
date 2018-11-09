package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class MinutesTest {

    @Test
    fun one_minute_is_60_seconds() {
        assertEquals(60.seconds, 1.minute)
    }

    @Test
    fun half_a_minute_is_30_seconds() {
        assertEquals(30.seconds, 0.5f.minutes)
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.minutes, 1.minute + 30.seconds)
        assertEquals(1.5.minutes, 30.seconds + 1.minute)
    }

    @Test
    fun subtraction_of_other_duration_calculates_correctly() {
        assertEquals(0.5.minutes, 1.minute - 30.seconds)
        assertEquals(0.5.minutes, 60.seconds - 0.5.minute)
    }
}
