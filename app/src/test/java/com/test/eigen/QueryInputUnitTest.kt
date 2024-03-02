package com.test.eigen

import org.junit.Assert.assertEquals
import org.junit.Test

class QueryInputUnitTest {

    private val functionQuery = QueryInput()

    @Test
    fun `test countOccurrences with given example`() {
        val input = listOf("xc", "dz", "bbb", "dz")
        val query = listOf("bbb", "ac", "dz")
        val expected = listOf(1, 0, 2)

        val result = functionQuery.queryInput(input, query)

        assertEquals(expected, result)
    }

    @Test
    fun `test countOccurrences with empty query`() {
        val input = listOf("xc", "dz", "bbb", "dz")
        val query = listOf<String>()
        val expected = listOf<Int>()

        val result = functionQuery.queryInput(input, query)

        assertEquals(expected, result)
    }

    @Test
    fun `test countOccurrences with empty input`() {
        val input = listOf<String>()
        val query = listOf("bbb", "ac", "dz")
        val expected = listOf(0, 0, 0)

        val result = functionQuery.queryInput(input, query)

        assertEquals(expected, result)
    }

}