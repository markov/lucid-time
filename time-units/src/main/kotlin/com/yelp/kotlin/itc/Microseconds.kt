package com.yelp.kotlin.itc

inline class Microseconds(override val toNanos: Long) : Duration

inline val Duration.asMicros: Microseconds get() = Microseconds(toNanos)
inline val Number.micros: Microseconds get() = 1000.nanos.asMicros
inline val Number.microsecond: Microseconds get() = micros
