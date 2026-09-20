package org.example

class Franc(amount: Int) : Money() {

    init {
        this.amount = amount
    }

    internal fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

}