package com.guyi.class25b_and_6

import java.text.DecimalFormat

private val formatter = DecimalFormat("#.##")

fun Long.toHumanReadable(): String {
    val absValue = kotlin.math.abs(this)
    return when {
        absValue >= 1_000_000_000_000 -> format(this, 1_000_000_000_000, "t")
        absValue >=   1_000_000_000 -> format(this,   1_000_000_000, "b")
        absValue >=       1_000_000 -> format(this,       1_000_000, "m")
        absValue >=         1_000 -> format(this,         1_000, "k")
        else -> this.toString()
    }
}

private fun Long.format(value: Long, divisor: Long, suffix: String): String {
    val truncated = this.toDouble() / divisor
    // e.g. 1.0 -> "1", 1.50 -> "1.5", 1.567 -> "1.57"
    val formatted = formatter.format(truncated)
    return if (this < 0) "-${formatted}$suffix" else "$formatted$suffix"
}