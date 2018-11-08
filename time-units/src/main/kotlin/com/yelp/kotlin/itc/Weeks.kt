package com.yelp.kotlin.itc

inline class Weeks(override val nanos: Long) : Duration<Weeks> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Weeks(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Weeks(nanos - other.nanos)
}

inline val Duration<*>.asWeeks: Weeks get() = Weeks(nanos)

inline val Double.weeks: Weeks get() = (7.0 * this).days.asWeeks
inline val Double.week: Weeks get() = weeks

inline val Float.weeks: Weeks get() = this.toDouble().weeks
inline val Float.week: Weeks get() = weeks

inline val Long.weeks: Weeks get() = (7L * this).days.asWeeks
inline val Number.weeks: Weeks get() = this.toLong().weeks
inline val Number.week: Weeks get() = weeks
