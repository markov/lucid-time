package com.yelp.kotlin.itc

inline class Days(override val nanos: Long) : Duration<Days> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Days(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Days(nanos - other.nanos)
}

inline val Duration<*>.asDays: Days get() = Days(nanos)

inline val Double.days: Days get() = (24.0 * this).hours.asDays
inline val Double.day: Days get() = days

inline val Float.days: Days get() = this.toDouble().days
inline val Float.day: Days get() = days

inline val Long.days: Days get() = (24L * this).hours.asDays
inline val Number.days: Days get() = this.toLong().days
inline val Number.day: Days get() = days
