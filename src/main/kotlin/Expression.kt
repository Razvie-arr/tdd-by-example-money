package org.example

interface Expression {

    fun reduce(bank: Bank, to: String): Money

    fun plus(addend: Expression): Expression

}