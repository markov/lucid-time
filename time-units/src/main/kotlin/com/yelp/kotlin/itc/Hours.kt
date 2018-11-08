package com.yelp.kotlin.itc

inline class Hours(override val toNanos: Long) : Duration

inline val Duration.asHours: Hours get() = Hours(toNanos)
inline val Number.hours: Hours get() = 60.minutes.asHours
inline val Number.hour: Hours get() = hours
