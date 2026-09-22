package org.example

class Money(val amount: Int, val currency: String) : Expression {

    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")
        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    override fun times(multiplier: Int): Expression = Money(amount * multiplier, currency)

    override fun plus(addend: Expression): Expression = Sum(this, addend)

    override fun equals(other: Any?): Boolean {
        if (other !is Money) return false
        return amount == other.amount && currency == other.currency
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