package org.example

abstract class Money(protected var amount: Int, val currency: String) {

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && javaClass == money.javaClass
    }
    
}