package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class SecondsTest {

    @Test
    fun one_second_is_1000_millis() {
        assertEquals(1000.millis, 1.second)
    }

    @Test
    fun half_a_second_is_500_millis() {
        assertEquals(500.millis, 0.5f.seconds)
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.seconds, 1.second + 500.millis)
        assertEquals(1.5.seconds, 500.millis + 1.second)
    }

    @Test
    fun subtraction_of_other_duration_calculates_correctly() {
        assertEquals(0.5.seconds, 1.second - 500.millis)
        assertEquals(0.5.seconds, 1000.millis - 0.5f.seconds)
    }
}
