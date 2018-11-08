package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class NanosecondsTest {

    @Test
    fun max_nanos_is_292_years() {
        assertEquals(292, Long.MAX_VALUE.nanos.toYears)
    }

    @Test
    fun min_nanos_is_negative_292_years() {
        assertEquals(-292, Long.MIN_VALUE.nanos.toYears)
    }

    @Test
    fun float_to_int_equal_results() {
        assertEquals(30.0f.nanos, 30.nanos)
    }

    @Test
    fun double_to_long_equal_results() {
        assertEquals(30.0.nanos, 30L.nanos)
    }
}
