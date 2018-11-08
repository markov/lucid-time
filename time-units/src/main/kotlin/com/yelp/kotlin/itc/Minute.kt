package com.yelp.kotlin.itc

inline class Minutes(override val toNanos: Long) : Duration

inline val Duration.asMinutes: Minutes get() = Minutes(toNanos)
inline val Number.minutes: Minutes get() = 60.seconds.asMinutes
inline val Number.minute: Minutes get() = minutes
