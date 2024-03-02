package com.test.eigen

class Matrix {
    fun calculateMatrix(matrix: List<List<Int>>): Int {
        var firstDiagonalSum = 0
        var secondDiagonalSum = 0
        val size = matrix.size

        for (i in matrix.indices) {
            firstDiagonalSum += matrix[i][i]
            secondDiagonalSum += matrix[i][size - i - 1]
        }

        return firstDiagonalSum - secondDiagonalSum
    }
}