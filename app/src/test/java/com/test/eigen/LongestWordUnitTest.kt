package com.test.eigen
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.math.log

class LongestWordUnitTest {
    private val longestWord = LongestWord()
    @Test
    fun testFindLongestWord() {
            val sentence = "Saya sangat senang menonton movie duneparttwo"
            val expected = Pair("duneparttwo", 11)
            val actual = longestWord.word(sentence)
            assertEquals(expected, actual)
        }

    @Test
    fun testFindLongestWordWithMultipleLongestWords() {
        val sentence = "Saya sangat senang menonton movie duneparttwo dan penyelesaian"
        val expected = Pair("penyelesaian", 12)
        val actual = longestWord.word(sentence)
        assertEquals(expected, actual)
    }
    }
