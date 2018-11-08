package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class MillisecondsTest {

    @Test
    fun one_millisecond_is_1000_micros() {
        assertEquals(1000.micros(), 1.millisecond())
    }

    @Test
    fun half_a_millisecond_is_500_micros() {
        assertEquals(500.micros(), 0.5f.millis())
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.millis, 1.millisecond + 500.micros)
    }

    @Test
    fun subscration_of_other_duration_calculates_correctly() {
        assertEquals(0.5.millis, 1.millisecond - 500.micros)
    }
}
