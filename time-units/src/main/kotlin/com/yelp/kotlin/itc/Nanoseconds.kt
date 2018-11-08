package com.yelp.kotlin.itc

inline class Nanoseconds(override val toNanos: Long) : Duration

inline val Duration.asNanos: Nanoseconds get() = Nanoseconds(toNanos)
inline val Number.nanos: Nanoseconds get() = Nanoseconds(this.toLong())
inline val Number.nanosecond: Nanoseconds get() = nanos
