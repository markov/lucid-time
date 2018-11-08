package com.yelp.kotlin.itc

inline class Months(override val nanos: Long) : Duration<Months> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Months(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Months(nanos - other.nanos)
}

inline val Duration<*>.asMonths: Months get() = Months(nanos)

inline val Double.months: Months get() = (30.0 * this).days.asMonths
inline val Double.month: Months get() = months

inline val Float.months: Months get() = this.toDouble().months
inline val Float.month: Months get() = months

inline val Long.months: Months get() = (30L * this).days.asMonths
inline val Number.months: Months get() = this.toLong().months
inline val Number.month: Months get() = months
