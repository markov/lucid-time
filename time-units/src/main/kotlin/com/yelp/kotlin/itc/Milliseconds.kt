package com.yelp.kotlin.itc

inline class Milliseconds(override val toNanos: Long) : Duration

inline val Duration.asMillis: Milliseconds get() = Milliseconds(toNanos)
inline val Number.millis: Milliseconds get() = 1000.micros.asMillis
inline val Number.millisecond: Milliseconds get() = millis
