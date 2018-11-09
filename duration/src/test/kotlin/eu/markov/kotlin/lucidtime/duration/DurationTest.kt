package eu.markov.kotlin.lucidtime.duration

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotSame
import kotlin.test.assertNull

private const val half_an_hour_string = "Half an hour"
private const val half_a_day_string = "Half a day"

class DurationTest {

    @Test
    fun max_nanos_is_about_292_years() {
        assertEquals(292, Long.MAX_VALUE.nanos.toDays / 365)
    }

    @Test
    fun min_nanos_is_about_negative_292_years() {
        assertEquals(-292, Long.MIN_VALUE.nanos.toDays / 365)
    }

    @Test
    fun any_duration_subtype_can_be_used_as_a_map_key() {
        val map =
            mapOf(
                0.5.hours to half_an_hour_string,
                0.5.days to half_a_day_string
            )
        assertEquals(half_an_hour_string, map[0.5.hours])
        assertEquals(half_an_hour_string, map[30.minutes])
        assertEquals(half_an_hour_string, map[30.asMinutes])

        assertEquals(half_a_day_string, map[0.5.days])
        assertEquals(half_a_day_string, map[12.hours])
        assertEquals(half_a_day_string, map[12.asHours])

        assertNull(map[0.5.hours + 1.nano])
        assertNull(map[0.5.days + 1.nano])
    }

    @Test
    fun equality_across_subtypes() {
        assertEquals(30.minutes, 0.5.asHours)
        assertNotEquals<Class<*>>(30.minutes.javaClass, 0.5.asHours.javaClass)
    }

    @Test
    fun hash_code_equality_across_subtypes() {
        assertEquals(30.minutes.hashCode(), 0.5.asHours.hashCode())
        assertNotEquals<Class<*>>(30.minutes.javaClass, 0.5.asHours.javaClass)
    }

    @Test
    fun sorting_order_with_different_subtypes() {
        val expected = listOf(
            1.asNanos,
            1.asMicros,
            1.asMillis,
            1.asSeconds,
            1.asMinutes,
            1.asHours,
            1.asDays,
            1.asWeeks
        )
        val sorted = expected.reversed().sorted()

        assertNotSame(expected, sorted)
        assertEquals(expected, sorted)
    }
}
