package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class MicrosecondsTest {

    @Test
    fun one_microsecond_is_1000_nanos() {
        assertEquals(1000.nanos(), 1.microsecond())
    }

    @Test
    fun half_a_microsecond_is_500_nanos() {
        assertEquals(500.nanos(), 0.5f.micros())
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.micros, 1.microsecond + 500.nanos)
    }

    @Test
    fun subscration_of_other_duration_calculates_correctly() {
        assertEquals(0.5.micros, 1.microsecond - 500.nanos)
    }
}
