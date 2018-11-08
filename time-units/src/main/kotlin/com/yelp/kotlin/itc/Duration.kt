package com.yelp.kotlin.itc

interface Duration : Comparable<Duration> {
    val toNanos: Long

    override fun compareTo(other: Duration): Int {
        return this.toNanos.compareTo(other.toNanos)
    }
}

inline val Duration.toMicros: Long get() = toNanos / 1000
inline val Duration.toMillis: Long get() = toMicros / 1000
inline val Duration.toSeconds: Long get() = toMillis / 1000
inline val Duration.toMinutes: Long get() = toSeconds / 60
inline val Duration.toHours: Long get() = toMinutes / 60
inline val Duration.toDays: Long get() = toHours / 24
inline val Duration.toWeeks: Long get() = toDays / 7
inline val Duration.toMonths: Long get() = toDays / 30
inline val Duration.toYears: Long get() = toDays / 365
inline val Duration.toDecades: Long get() = toYears / 10
inline val Duration.toCenturies: Long get() = toYears / 100
