package com.test.eigen

import org.junit.Assert.assertEquals
import org.junit.Test

class MatrixUnitTest {
    private val matrixUtils = Matrix()
    @Test
    fun testCalculateDiagonalDifference() {
        val matrix = listOf(
            listOf(1, 2, 0),
            listOf(4, 5, 6),
            listOf(7, 8, 9)
        )
        val expectedResult = 3

        val result = matrixUtils.calculateMatrix(matrix)

        assertEquals(expectedResult, result)
    }
}