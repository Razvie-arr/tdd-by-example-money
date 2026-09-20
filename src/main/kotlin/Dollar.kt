package org.example

class Dollar(amount: Int) : Money() {

    init {
        this.amount = amount
    }

    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }

}