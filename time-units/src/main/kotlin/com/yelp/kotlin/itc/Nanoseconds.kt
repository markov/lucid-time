package com.yelp.kotlin.itc

inline class Nanoseconds(override val nanos: Long) : Duration<Nanoseconds> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Nanoseconds(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Nanoseconds(nanos - other.nanos)
}

inline val Duration<*>.asNanos: Nanoseconds get() = Nanoseconds(nanos)
inline val Number.nanos: Nanoseconds get() = Nanoseconds(this.toLong())
inline val Number.nanosecond: Nanoseconds get() = nanos
