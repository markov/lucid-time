package com.yelp.kotlin.itc

inline class Microseconds(override val nanos: Long) : Duration<Microseconds> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Microseconds(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Microseconds(nanos - other.nanos)
}

inline val Duration<*>.asMicros: Microseconds get() = Microseconds(nanos)

inline val Double.micros: Microseconds get() = (1000.0 * this).nanos.asMicros
inline val Double.microsecond: Microseconds get() = micros

inline val Float.micros: Microseconds get() = this.toDouble().micros
inline val Float.microsecond: Microseconds get() = micros

inline val Long.micros: Microseconds get() = (1000L * this).nanos.asMicros
inline val Number.micros: Microseconds get() = this.toLong().micros
inline val Number.microsecond: Microseconds get() = this.toLong().micros
