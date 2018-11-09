package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class DaysTest {

    @Test
    fun one_day_is_24_hours() {
        assertEquals(24.hours, 1.day)
    }

    @Test
    fun half_a_day_is_12_hours() {
        assertEquals(12.hours, 0.5f.days)
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.days, 1.day + 12.hours)
        assertEquals(1.5.days, 12.hours + 1.day)
    }

    @Test
    fun subtraction_of_other_duration_calculates_correctly() {
        assertEquals(0.5.days, 1.day - 12.hours)
        assertEquals(0.5.days, 24.hours - 0.5.day)
    }
}
