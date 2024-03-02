package com.test.eigen

class ReverseAlphabet {
    fun stringManipulating(input: String): String {
        // Langkah 1: Mengubah string menjadi array karakter
        val charArray = input.toCharArray()

        // Langkah 2: Memecah huruf dan angka dari array
        val numbers = charArray.filter { it.isDigit() }
        val letters = charArray.filter { it.isLetter() }.reversed()

        // Langkah 3: Menggabungkan huruf dan angka kedalam string
        return letters.joinToString("") + numbers.joinToString("")
    }
}