package com.test.eigen
import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseAlphabetUnitTest {
    @Test
    fun `test reverseAlphabetOnly function`() {
        val input = "NEGIE1"
        val expectedOutput = "EIGEN1"
        val reverseAlphabet = ReverseAlphabet()
        val result = reverseAlphabet.stringManipulating(input)
        assertEquals(expectedOutput, result)
    }
}