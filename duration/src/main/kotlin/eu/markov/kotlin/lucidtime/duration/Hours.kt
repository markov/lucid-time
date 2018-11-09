package eu.markov.kotlin.lucidtime.duration

class Hours internal constructor(nanos: Long) : Duration(nanos) {
    override operator fun plus(other: Duration) =
        Hours(nanos + other.nanos)
    override operator fun minus(other: Duration) =
        Hours(nanos - other.nanos)
}

val Duration.asHours: Hours
    get() = Hours(
        nanos
    )
inline val Double.asHours: Hours get() = hours.asHours
inline val Float.asHours: Hours get() = hours.asHours
inline val Number.asHours: Hours get() = hours.asHours

inline val Double.hours: Duration get() = (60.0 * this).minutes
inline val Float.hours: Duration get() = this.toDouble().hours
inline val Long.hours: Duration get() = (60L * this).minutes
inline val Number.hours: Duration get() = this.toLong().hours

inline val Double.hour: Duration get() = hours
inline val Float.hour: Duration get() = hours
inline val Long.hour: Duration get() = hours
inline val Number.hour: Duration get() = hours
