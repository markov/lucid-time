package com.yelp.kotlin.itc

class Milliseconds internal constructor(nanos: Long) : Duration(nanos) {
    override operator fun plus(other: Duration) = Milliseconds(nanos + other.nanos)
    override operator fun minus(other: Duration) = Milliseconds(nanos - other.nanos)
}

val Duration.asMillis: Milliseconds get() = Milliseconds(nanos)
inline val Double.asMillis: Milliseconds get() = millis.asMillis
inline val Float.asMillis: Milliseconds get() = millis.asMillis
inline val Number.asMillis: Milliseconds get() = millis.asMillis

inline val Double.millis: Duration get() = (1000.0 * this).micros
inline val Float.millis: Duration get() = this.toDouble().millis
inline val Long.millis: Duration get() = (1000L * this).micros
inline val Number.millis: Duration get() = this.toLong().millis

inline val Double.milli: Duration get() = millis
inline val Float.milli: Duration get() = millis
inline val Long.milli: Duration get() = millis
inline val Number.milli: Duration get() = millis
