package org.example

abstract class Money {

    var amount: Int = 0

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)
        fun franc(amount: Int): Money = Franc(amount)
    }

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && javaClass == money.javaClass
    }


}