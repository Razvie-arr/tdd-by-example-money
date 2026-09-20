package org.example

class Dollar(amount: Int) : Money() {

    init {
        this.amount = amount
    }

    internal fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

}