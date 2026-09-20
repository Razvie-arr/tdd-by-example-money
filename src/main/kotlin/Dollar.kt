package org.example

class Dollar(var amount: Int) {

    internal fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        val dollar: Dollar = other as Dollar
        return amount == dollar.amount
    }

}