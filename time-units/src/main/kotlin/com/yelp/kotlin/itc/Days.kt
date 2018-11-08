package com.yelp.kotlin.itc

inline class Days(override val toNanos: Long) : Duration

inline val Duration.asDays: Days get() = Days(toNanos)
inline val Number.days: Days get() = 24.hours.asDays
inline val Number.day: Days get() = days
