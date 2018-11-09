package eu.markov.kotlin.lucidtime.duration

abstract class Duration(internal val nanos: Long) : Comparable<Duration> {
    abstract operator fun plus(other: Duration): Duration
    abstract operator fun minus(other: Duration): Duration

    override fun compareTo(other: Duration): Int {
        return nanos.compareTo(other.nanos)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Duration) return false
        return nanos == other.nanos
    }

    override fun hashCode(): Int {
        return nanos.hashCode()
    }

    override fun toString(): String {
        return "${javaClass.simpleName}(nanos=$nanos)"
    }
}

val Duration.toNanos: Long get() = nanos
inline val Duration.toMicros: Long get() = toNanos / 1000
inline val Duration.toMillis: Long get() = toMicros / 1000
inline val Duration.toSeconds: Long get() = toMillis / 1000
inline val Duration.toMinutes: Long get() = toSeconds / 60
inline val Duration.toHours: Long get() = toMinutes / 60
inline val Duration.toDays: Long get() = toHours / 24
inline val Duration.toWeeks: Long get() = toDays / 7
