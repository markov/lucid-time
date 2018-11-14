package eu.markov.kotlin.lucidtime.duration

inline val Double.weeks: Duration get() = (7.0 * this).days
inline val Float.weeks: Duration get() = this.toDouble().weeks
inline val Long.weeks: Duration get() = (7L * this).days
inline val Number.weeks: Duration get() = this.toLong().weeks

inline val Double.week: Duration get() = weeks
inline val Float.week: Duration get() = weeks
inline val Long.week: Duration get() = weeks
inline val Number.week: Duration get() = weeks
