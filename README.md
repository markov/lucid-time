Lucid Time for Kotlin
=====================

[![build status](https://travis-ci.org/markov/lucid-time.svg?branch=master)](https://travis-ci.org/markov/lucid-time)

The goal of this project is to make working with time durations in Kotlin simpler.

Usage
-----

Add it to your gradle dependencies.

```kotlin
dependencies {
    implementation("eu.markov.kotlin.lucidtime:duration:2.0.0")
}
```

The main purpose is to make declaring time literals in code very concise and very close to the natural English language.

```kotlin
val soon = Random.nextDouble(52.0).weeks
val threeMin = 3.minutes
val anHourAndAHalf: Duration = 1.5.hours
val aLittleLonger: Duration = anHourAndAHalf + threeMin
val aLittleLongerMillis: Long = notQuiteAsLong.toMillis
val aWeekAndAHalfInMinutes: Long = 1.5.weeks.toMinutes
```

At the same time this library aims to keep guarantees when you compare durations from across the different types it exposes.

```kotlin
assertTrue(59.minutes < 1.hour)
assertTrue(60.minutes == 1.hour)
assertTrue(61.minutes > 1.hour)
```

All insntances are immutable and the implementation of`equals()` and `hashCode()`  makes them safe to use as keys in maps.

```kotlin
val map = mapOf(1.hour to "an hour")
assertEquals("an hour", map[60.minutes])
```

The main goal when writing this code was to replace APIs using Java's [`TimeUnit`][java_time_unit] like:
```kotlin
fun delayBy(amount: Long, unit: TimeUnit) {...}

delayBy(150, TimeUnit.SECONDS)
```

And allow for simpler APIs like:
```kotlin
fun delayBy(amount: Duration) {...}

delayBy(150.seconds)
delayBy(2.5.minutes)
delayBy(2.minutes + 30.seconds)
```

As well as declaring constants like:
```kotlin
val OLD_30_SECONDS_IN_MILLIS: Long = TimeUnit.SECONDS.toMillis(30)
val NEW_30_SECONDS_IN_MILLIS: Long = 30.seconds.toMillis
```

License
=======

    Copyright 2018 Gesh Markov

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


[java_time_unit]: https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/TimeUnit.html
