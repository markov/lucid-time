package eu.markov.kotlin.lucidtime.duration

import org.junit.Test
import java.util.concurrent.TimeUnit
import kotlin.test.assertEquals

class HoursTest {

    @Test
    fun one_hour_is_60_minutes() {
        assertEquals(60.minutes, 1.hour)
    }

    @Test
    fun half_a_hour_is_30_minutes() {
        assertEquals(30.minutes, 0.5f.hours)
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.hours, 1.hour + 30.minutes)
        assertEquals(1.5.hours, 30.minutes + 1.hour)
    }

    @Test
    fun subtraction_of_other_duration_calculates_correctly() {
        assertEquals(0.5.hours, 1.hour - 30.minutes)
        assertEquals(0.5.hours, 60.minutes - 0.5.hour)
    }

    @Test
    fun is_equal_to_native_time_unit() {
        assertEquals(TimeUnit.HOURS.toNanos(42), 42.hours.toNanos)
    }
}
