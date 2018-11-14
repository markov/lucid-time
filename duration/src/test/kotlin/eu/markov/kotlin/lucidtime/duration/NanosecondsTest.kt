package eu.markov.kotlin.lucidtime.duration

import org.junit.Test
import java.util.concurrent.TimeUnit
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

    @Test
    fun is_equal_to_native_time_unit() {
        assertEquals(TimeUnit.NANOSECONDS.toNanos(42), 42.nano.toNanos)
    }
}
