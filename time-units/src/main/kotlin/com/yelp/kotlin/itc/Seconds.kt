package com.yelp.kotlin.itc

inline class Seconds(override val nanos: Long) : Duration<Seconds> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Seconds(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Seconds(nanos - other.nanos)
}

inline val Duration<*>.asSeconds: Seconds get() = Seconds(nanos)

inline val Double.seconds: Seconds get() = (1000.0 * this).millis.asSeconds
inline val Double.second: Seconds get() = seconds

inline val Float.seconds: Seconds get() = this.toDouble().seconds
inline val Float.second: Seconds get() = this.toDouble().seconds

inline val Long.seconds: Seconds get() = (1000L * this).millis.asSeconds
inline val Number.seconds: Seconds get() = this.toLong().seconds
inline val Number.second: Seconds get() = this.toLong().seconds
