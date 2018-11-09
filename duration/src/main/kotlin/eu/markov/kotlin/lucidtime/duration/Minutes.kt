package eu.markov.kotlin.lucidtime.duration

class Minutes internal constructor(nanos: Long) : Duration(nanos) {
    override operator fun plus(other: Duration) =
        Minutes(nanos + other.nanos)
    override operator fun minus(other: Duration) =
        Minutes(nanos - other.nanos)
}

val Duration.asMinutes: Minutes
    get() = Minutes(
        nanos
    )
inline val Double.asMinutes: Minutes get() = minutes.asMinutes
inline val Float.asMinutes: Minutes get() = minutes.asMinutes
inline val Number.asMinutes: Minutes get() = minutes.asMinutes

inline val Double.minutes: Duration get() = (60.0 * this).seconds
inline val Float.minutes: Duration get() = this.toDouble().minutes
inline val Long.minutes: Duration get() = (60L * this).seconds
inline val Number.minutes: Duration get() = this.toLong().minutes

inline val Double.minute: Duration get() = minutes
inline val Float.minute: Duration get() = minutes
inline val Long.minute: Duration get() = minutes
inline val Number.minute: Duration get() = minutes
