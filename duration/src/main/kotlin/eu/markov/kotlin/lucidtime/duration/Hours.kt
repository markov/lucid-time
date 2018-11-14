package eu.markov.kotlin.lucidtime.duration

inline val Double.hours: Duration get() = (60.0 * this).minutes
inline val Float.hours: Duration get() = this.toDouble().hours
inline val Long.hours: Duration get() = (60L * this).minutes
inline val Number.hours: Duration get() = this.toLong().hours

inline val Double.hour: Duration get() = hours
inline val Float.hour: Duration get() = hours
inline val Long.hour: Duration get() = hours
inline val Number.hour: Duration get() = hours
