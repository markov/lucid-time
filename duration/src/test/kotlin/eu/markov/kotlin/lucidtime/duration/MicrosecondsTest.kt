package eu.markov.kotlin.lucidtime.duration

import org.junit.Test
import kotlin.test.assertEquals

class MicrosecondsTest {

    @Test
    fun one_microsecond_is_1000_nanos() {
        assertEquals(1000.nanos, 1.micro)
    }

    @Test
    fun half_a_microsecond_is_500_nanos() {
        assertEquals(500.nanos, 0.5f.micros)
    }

    @Test
    fun addition_of_other_duration_calculates_correctly() {
        assertEquals(1.5.micros, 1.micro + 500.nanos)
        assertEquals(1.5.micros, 500.nanos + 1.micro)
    }

    @Test
    fun subtraction_of_other_duration_calculates_correctly() {
        assertEquals(0.5.micros, 1.micro - 500.nanos)
        assertEquals(0.5.micros, 1000.nanos - 0.5f.micro)
    }
}
