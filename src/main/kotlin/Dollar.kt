package org.example

class Dollar(var amount: Int) {

    internal fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

}