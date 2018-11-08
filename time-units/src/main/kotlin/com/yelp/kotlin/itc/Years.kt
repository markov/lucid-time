package com.yelp.kotlin.itc

inline class Years(override val toNanos: Long) : Duration

inline val Duration.asYears: Years get() = Years(toNanos)
inline val Number.years: Years get() = 365.days.asYears
inline val Number.year: Years get() = years
