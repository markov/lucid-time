package com.yelp.kotlin.itc

import org.hamcrest.Matchers.greaterThan
import org.junit.Assert.assertThat
import org.junit.Test
import kotlin.test.assertEquals

class MinutesTest {

    @Test
    fun half_minute_is_30_sec() {
        assertEquals(30.seconds(), 0.5.minutes())
    }

    @Test
    fun half_minute_is_not_31_sec() {
        assertThat(31.seconds(), greaterThan(0.5.minutes()))
    }
}
