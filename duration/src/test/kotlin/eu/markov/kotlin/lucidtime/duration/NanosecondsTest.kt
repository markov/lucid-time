package eu.markov.kotlin.lucidtime.duration

import org.junit.Test
import kotlin.test.assertEquals

class NanosecondsTest {

    @Test
    fun float_to_int_equal_results() {
        assertEquals(30.0f.nanos, 30.nanos)
    }

    @Test
    fun double_to_long_equal_results() {
        assertEquals(1.0.nano, 1L.nano)
    }

    @Test
    fun no_sub_nano_precision() {
        assertEquals(1, 1.nano.toNanos)
        assertEquals(0, 0.999.nanos.toNanos)
    }
}
