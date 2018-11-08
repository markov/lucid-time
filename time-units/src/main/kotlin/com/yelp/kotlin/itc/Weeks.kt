package com.yelp.kotlin.itc

inline class Weeks(override val toNanos: Long) : Duration

inline val Duration.asWeeks: Weeks get() = Weeks(toNanos)
inline val Number.weeks: Weeks get() = 7.days.asWeeks
inline val Number.week: Weeks get() = weeks
