package mykotlin.basics

import kotlin.test.assertFalse
import kotlin.test.assertTrue

fun main() {
    val first = "kotlin"
    val second = "kotlin"
    val firstCapatilized = "KOTLIN"

    assertTrue { first == second }
    assertFalse { first == firstCapatilized }
}