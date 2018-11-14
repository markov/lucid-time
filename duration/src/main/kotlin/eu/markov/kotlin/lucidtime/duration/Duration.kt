package eu.markov.kotlin.lucidtime.duration

inline class Duration(val nanos: Long) : Comparable<Duration> {
    operator fun plus(other: Duration) = Duration(nanos + other.nanos)
    operator fun minus(other: Duration) = Duration(nanos - other.nanos)

    override fun compareTo(other: Duration): Int {
        return nanos.compareTo(other.nanos)
    }

    override fun toString(): String {
        return "Duration(nanos=$nanos)"
    }
}

inline val Duration.toNanos: Long get() = nanos
inline val Duration.toMicros: Long get() = toNanos / 1000
inline val Duration.toMillis: Long get() = toMicros / 1000
inline val Duration.toSeconds: Long get() = toMillis / 1000
inline val Duration.toMinutes: Long get() = toSeconds / 60
inline val Duration.toHours: Long get() = toMinutes / 60
inline val Duration.toDays: Long get() = toHours / 24
inline val Duration.toWeeks: Long get() = toDays / 7
