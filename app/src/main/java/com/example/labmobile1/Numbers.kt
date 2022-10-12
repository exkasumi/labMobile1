package com.example.labmobile1

import kotlin.random.Random



    class Numbers {


        var numbers: List<Int> = listOf()
        var result: Map<String, String> = mapOf()
        var inputData: String? = null
        var zero: Int = 0

        init {
            updateNumbers()
            updateData()

        }

        fun updateNumbers() {
            numbers = List(10) { Random.nextInt(0, 10) }
        }

        fun updateData() {
            inputData = numbers.joinToString()
        }


        fun listOfIndexes(): List<Int> {
            return numbers
                .withIndex()
                .filter { (index, value) -> value == 2 * zero }
                .map { (index, value) -> index }
        }

        fun setRes() {

            result = mapOf("indexes" to listOfIndexes().joinToString())
        }
    }



