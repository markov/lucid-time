package com.yelp.kotlin.itc

inline class Centuries(override val toNanos: Long) : Duration

inline val Duration.asCenturies: Centuries get() = Centuries(toNanos)
inline val Number.centuries: Centuries get() = 100.years.asCenturies
inline val Number.century: Centuries get() = centuries
