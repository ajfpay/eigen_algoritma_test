package com.test.eigen


class LongestWord {
    fun word(sentence: String): Pair<String, Int> {

        val words = sentence.split(" ")
        var longestWord = ""
        var longestWordLength = 0

        for (word in words) {
            if (word.length > longestWordLength) {
                longestWord = word
                longestWordLength = word.length
            }
        }

        return Pair(longestWord, longestWordLength)
    }

}