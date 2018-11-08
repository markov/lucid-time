package com.yelp.kotlin.itc

inline class Minutes(override val nanos: Long) : Duration<Minutes> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Minutes(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Minutes(nanos - other.nanos)
}

inline val Duration<*>.asMinutes: Minutes get() = Minutes(nanos)

inline val Double.minutes: Minutes get() = (60.0 * this).seconds.asMinutes
inline val Double.minute: Minutes get() = minutes

inline val Float.minutes: Minutes get() = this.toDouble().minutes
inline val Float.minute: Minutes get() = minutes

inline val Long.minutes: Minutes get() = (60L * this).seconds.asMinutes
inline val Number.minutes: Minutes get() = this.toLong().minutes
inline val Number.minute: Minutes get() = minutes
