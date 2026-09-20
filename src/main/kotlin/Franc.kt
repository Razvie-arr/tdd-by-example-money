package org.example

class Franc(amount: Int) : Money() {

    init {
        this.amount = amount
    }

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }

}