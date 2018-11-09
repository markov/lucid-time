package com.yelp.kotlin.itc

class Weeks internal constructor(nanos: Long) : Duration(nanos) {
    override operator fun plus(other: Duration) = Weeks(nanos + other.nanos)
    override operator fun minus(other: Duration) = Weeks(nanos - other.nanos)
}

val Duration.asWeeks: Weeks get() = Weeks(nanos)
inline val Double.asWeeks: Weeks get() = weeks.asWeeks
inline val Float.asWeeks: Weeks get() = weeks.asWeeks
inline val Number.asWeeks: Weeks get() = weeks.asWeeks

inline val Double.weeks: Duration get() = (7.0 * this).days
inline val Float.weeks: Duration get() = this.toDouble().weeks
inline val Long.weeks: Duration get() = (7L * this).days
inline val Number.weeks: Duration get() = this.toLong().weeks

inline val Double.week: Duration get() = weeks
inline val Float.week: Duration get() = weeks
inline val Long.week: Duration get() = weeks
inline val Number.week: Duration get() = weeks
