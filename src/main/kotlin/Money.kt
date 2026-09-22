package org.example

class Money(val amount: Int, val currency: String) : Expression {

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    fun times(multiplier: Int) = Money(amount * multiplier, currency)

    fun plus(addend: Money): Expression = Sum(this, addend)

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount && currency == money.currency
    }

    override fun toString() = "$amount $currency"

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

    override fun hashCode(): Int {
        var result = amount
        result = 31 * result + currency.hashCode()
        return result
    }

}