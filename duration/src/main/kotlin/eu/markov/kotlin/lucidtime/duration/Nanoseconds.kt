package eu.markov.kotlin.lucidtime.duration

inline val Number.nanos: Duration get() = Duration(this.toLong())
inline val Number.nano: Duration get() = nanos
