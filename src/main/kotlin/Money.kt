package org.example

open class Money(protected var amount: Int, val currency: String) : Expression {

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    fun times(multiplier: Int) = Money(amount * multiplier, currency)

    fun plus(addend: Money): Expression = Money(amount + addend.amount, currency)

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && currency == money.currency
    }

    override fun toString() = "$amount $currency"

}