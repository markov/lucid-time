package eu.markov.kotlin.lucidtime.duration

import org.junit.Test
import java.util.concurrent.TimeUnit
import kotlin.test.assertEquals

class MillisecondsTest {

    @Test
    fun one_millis_is_1000_micros() {
        assertEquals(1000.micros, 1.milli)
    }

    @Test
    fun half_a_millis_is_500_micros() {
        assertEquals(500.micros, 0.5f.millis)
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.millis, 1.milli + 500.micros)
        assertEquals(1.5.millis, 500.micros + 1.milli)
    }

    @Test
    fun subtraction_of_other_duration_calculates_correctly() {
        assertEquals(0.5.millis, 1.milli - 500.micros)
        assertEquals(0.5.millis, 1000.micros - 0.5f.millis)
    }

    @Test
    fun is_equal_to_native_time_unit() {
        assertEquals(TimeUnit.MILLISECONDS.toNanos(42), 42.millis.toNanos)
    }
}
