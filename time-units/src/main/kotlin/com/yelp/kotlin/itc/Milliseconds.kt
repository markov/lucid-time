package com.yelp.kotlin.itc

inline class Milliseconds(override val nanos: Long) : Duration<Milliseconds> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Milliseconds(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Milliseconds(nanos - other.nanos)
}

inline val Duration<*>.asMillis: Milliseconds get() = Milliseconds(nanos)

inline val Double.millis: Milliseconds get() = (1000.0 * this).micros.asMillis
inline val Double.millisecond: Milliseconds get() = millis

inline val Float.millis: Milliseconds get() = this.toDouble().millis
inline val Float.millisecond: Milliseconds get() = millis

inline val Long.millis: Milliseconds get() = (1000L * this).micros.asMillis
inline val Number.millis: Milliseconds get() = this.toLong().millis
inline val Number.millisecond: Milliseconds get() = this.toLong().millis
