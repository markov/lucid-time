package com.yelp.kotlin.itc

inline class Hours(override val nanos: Long) : Duration<Hours> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Hours(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Hours(nanos - other.nanos)
}

inline val Duration<*>.asHours: Hours get() = Hours(nanos)

inline val Double.hours: Hours get() = (60.0 * this).minutes.asHours
inline val Double.hour: Hours get() = hours

inline val Float.hours: Hours get() = this.toDouble().hours
inline val Float.hour: Hours get() = hours

inline val Long.hours: Hours get() = (60L * this).minutes.asHours
inline val Number.hours: Hours get() = this.toLong().hours
inline val Number.hour: Hours get() = hours
