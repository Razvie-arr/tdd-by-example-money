package org.example

class Bank {

    private val rates = mutableMapOf<Pair, Int>()

    fun addRate(from: String, to: String, rate: Int) = rates.put(Pair(from, to), rate)

    fun reduce(source: Expression, to: String) = source.reduce(this, to)

    fun rate(from: String, to: String): Int {
        if (from == to) return 1
        return rates[Pair(from, to)]!!
    }

}