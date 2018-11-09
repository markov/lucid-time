package eu.markov.kotlin.lucidtime.duration

class Days internal constructor(nanos: Long) : Duration(nanos) {
    override operator fun plus(other: Duration) =
        Days(nanos + other.nanos)
    override operator fun minus(other: Duration) =
        Days(nanos - other.nanos)
}

val Duration.asDays: Days
    get() = Days(
        nanos
    )
inline val Double.asDays: Days get() = days.asDays
inline val Float.asDays: Days get() = days.asDays
inline val Number.asDays: Days get() = days.asDays

inline val Double.days: Duration get() = (24.0 * this).hours
inline val Float.days: Duration get() = this.toDouble().days
inline val Long.days: Duration get() = (24L * this).hours
inline val Number.days: Duration get() = this.toLong().days

inline val Double.day: Duration get() = days
inline val Float.day: Duration get() = days
inline val Long.day: Duration get() = days
inline val Number.day: Duration get() = days
