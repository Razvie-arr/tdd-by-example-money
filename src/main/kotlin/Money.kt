package org.example

open class Money(protected var amount: Int, val currency: String) {

    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")
        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

    fun times(multiplier: Int) = Money(amount * multiplier, currency)

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && currency == money.currency
    }

    override fun toString() = "$amount $currency"

}