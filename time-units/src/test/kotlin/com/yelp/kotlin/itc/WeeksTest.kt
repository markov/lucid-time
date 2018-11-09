package com.yelp.kotlin.itc

import org.junit.Test
import kotlin.test.assertEquals

class WeeksTest {

    @Test
    fun one_week_is_7_days() {
        assertEquals(7.days, 1.week)
    }

    @Test
    fun half_a_week_is_3_and_a_half_days() {
        assertEquals(3.5.days, 0.5f.weeks)
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.weeks, 1.week + 3.5.days)
        assertEquals(1.5.weeks, 3.5.days + 1.week)
    }

    @Test
    fun subtraction_of_other_duration_calculates_correctly() {
        assertEquals(0.5.weeks, 1.week - 3.5.days)
        assertEquals(0.5.weeks, 7.days - 0.5.week)
    }
}
