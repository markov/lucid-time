package com.yelp.kotlin.itc

class Nanoseconds(nanos: Long) : Duration(nanos) {
    override operator fun plus(other: Duration) = Nanoseconds(nanos + other.nanos)
    override operator fun minus(other: Duration) = Nanoseconds(nanos - other.nanos)
}

val Duration.asNanos: Nanoseconds get() = Nanoseconds(nanos)
inline val Number.asNanos: Nanoseconds get() = Nanoseconds(this.toLong())

inline val Number.nanos: Duration get() = asNanos
inline val Number.nano: Duration get() = nanos
