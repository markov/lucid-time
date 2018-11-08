package com.yelp.kotlin.itc

inline class Years(override val nanos: Long) : Duration<Years> {
    override inline fun compareTo(other: Duration<*>): Int {
        return this.nanos.compareTo(other.nanos)
    }

    override inline operator fun plus(other: Duration<*>) = Years(nanos + other.nanos)
    override inline operator fun minus(other: Duration<*>) = Years(nanos - other.nanos)
}

inline val Duration<*>.asYears: Years get() = Years(nanos)

inline val Double.years: Years get() = (365.0 * this).days.asYears
inline val Double.year: Years get() = years

inline val Float.years: Years get() = this.toDouble().years
inline val Float.year: Years get() = years

inline val Long.years: Years get() = (365L * this).days.asYears
inline val Number.years: Years get() = this.toLong().years
inline val Number.year: Years get() = years
