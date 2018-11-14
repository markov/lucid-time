package eu.markov.kotlin.lucidtime.duration

inline val Double.millis: Duration get() = (1000.0 * this).micros
inline val Float.millis: Duration get() = this.toDouble().millis
inline val Long.millis: Duration get() = (1000L * this).micros
inline val Number.millis: Duration get() = this.toLong().millis

inline val Double.milli: Duration get() = millis
inline val Float.milli: Duration get() = millis
inline val Long.milli: Duration get() = millis
inline val Number.milli: Duration get() = millis
