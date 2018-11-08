package com.yelp.kotlin.itc

interface Duration<D> : Comparable<Duration<*>> {
    val nanos: Long
    operator fun plus(other: Duration<*>): D
    operator fun minus(other: Duration<*>): D
}

inline operator fun Duration<*>.invoke() = nanos
inline val Duration<*>.toNanos: Long get() = nanos
inline val Duration<*>.toMicros: Long get() = nanos / 1000
inline val Duration<*>.toMillis: Long get() = toMicros / 1000
inline val Duration<*>.toSeconds: Long get() = toMillis / 1000
inline val Duration<*>.toMinutes: Long get() = toSeconds / 60
inline val Duration<*>.toHours: Long get() = toMinutes / 60
inline val Duration<*>.toDays: Long get() = toHours / 24
inline val Duration<*>.toWeeks: Long get() = toDays / 7
inline val Duration<*>.toMonths: Long get() = toDays / 30
inline val Duration<*>.toYears: Long get() = toDays / 365
