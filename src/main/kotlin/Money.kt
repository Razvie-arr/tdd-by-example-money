package org.example

open class Money {

    var amount: Int = 0

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
    }

}