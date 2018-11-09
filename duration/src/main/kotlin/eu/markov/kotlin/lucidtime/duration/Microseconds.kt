package eu.markov.kotlin.lucidtime.duration

class Microseconds internal constructor(nanos: Long) : Duration(nanos) {
    override operator fun plus(other: Duration) =
        Microseconds(nanos + other.nanos)
    override operator fun minus(other: Duration) =
        Microseconds(nanos - other.nanos)
}

val Duration.asMicros: Microseconds
    get() = Microseconds(
        nanos
    )
inline val Double.asMicros: Microseconds get() = micros.asMicros
inline val Float.asMicros: Microseconds get() = micros.asMicros
inline val Number.asMicros: Microseconds get() = micros.asMicros

inline val Double.micros: Duration get() = (1000.0 * this).nanos
inline val Float.micros: Duration get() = this.toDouble().micros
inline val Long.micros: Duration get() = (1000L * this).nanos
inline val Number.micros: Duration get() = this.toLong().micros

inline val Double.micro: Duration get() = micros
inline val Float.micro: Duration get() = micros
inline val Long.micro: Duration get() = micros
inline val Number.micro: Duration get() = micros
