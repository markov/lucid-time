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
}
