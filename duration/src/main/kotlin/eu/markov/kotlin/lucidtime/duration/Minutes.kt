package eu.markov.kotlin.lucidtime.duration

inline val Double.minutes: Duration get() = (60.0 * this).seconds
inline val Float.minutes: Duration get() = this.toDouble().minutes
inline val Long.minutes: Duration get() = (60L * this).seconds
inline val Number.minutes: Duration get() = this.toLong().minutes

inline val Double.minute: Duration get() = minutes
inline val Float.minute: Duration get() = minutes
inline val Long.minute: Duration get() = minutes
inline val Number.minute: Duration get() = minutes
