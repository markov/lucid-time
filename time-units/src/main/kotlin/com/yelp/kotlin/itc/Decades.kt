package com.yelp.kotlin.itc

inline class Decades(override val toNanos: Long) : Duration

inline val Duration.asDecades: Decades get() = Decades(toNanos)
inline val Number.decades: Decades get() = 10.years.asDecades
inline val Number.decade: Decades get() = decades
