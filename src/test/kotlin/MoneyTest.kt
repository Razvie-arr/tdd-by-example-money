import org.example.Bank
import org.example.Expression
import org.example.Money
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class MoneyTest {

    @Test
    fun `test multiplication`() {
        val five: Money = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun `test equality`() {
        assertEquals(Money.dollar(5), Money.dollar(5))
        assertNotEquals(Money.dollar(5), Money.dollar(6))
        assertNotEquals(Money.franc(5), Money.dollar(5))
    }

    @Test
    fun `test currency`() {
        assertEquals("USD", Money.dollar(1).currency)
        assertEquals("CHF", Money.franc(1).currency)
    }

    @Test
    fun `test simple addition`() {
        val five = Money.dollar(5)
        val sum: Expression = five.plus(five)
        val bank = Bank()
        val reduced: Money = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(10), reduced)
    }

}