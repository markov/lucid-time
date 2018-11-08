package com.yelp.kotlin.itc

inline class Months(override val toNanos: Long) : Duration

inline val Duration.asMonths: Months get() = Months(toNanos)
inline val Number.months: Months get() = 30.days.asMonths
inline val Number.month: Months get() = months
