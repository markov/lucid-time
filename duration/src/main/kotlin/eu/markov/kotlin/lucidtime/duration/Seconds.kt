package eu.markov.kotlin.lucidtime.duration

inline val Double.seconds: Duration get() = (1000.0 * this).millis
inline val Float.seconds: Duration get() = this.toDouble().seconds
inline val Long.seconds: Duration get() = (1000L * this).millis
inline val Number.seconds: Duration get() = this.toLong().seconds

inline val Double.second: Duration get() = seconds
inline val Float.second: Duration get() = seconds
inline val Long.second: Duration get() = seconds
inline val Number.second: Duration get() = seconds
