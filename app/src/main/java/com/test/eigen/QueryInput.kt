package com.test.eigen

class QueryInput {
    fun queryInput(input: List<String>, query: List<String>): List<Int> {
        return query.map { word -> input.count { it == word } }
    }
}