package com.yelp.kotlin.itc

inline class Seconds(override val toNanos: Long) : Duration

inline val Duration.asSeconds: Seconds get() = Seconds(toNanos)
inline val Number.seconds: Seconds get() = 1000.millis.asSeconds
inline val Number.second: Seconds get() = seconds
