import org.example.Dollar
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class MoneyTest {

    @Test
    fun `test multiplication`() {
        val five = Dollar(5)
        var product = five.times(2)
        assertEquals(10, product.amount)

        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun `test equality`() {
        assertEquals(Dollar(5), Dollar(5))
        assertNotEquals(Dollar(5), Dollar(6))
    }

}