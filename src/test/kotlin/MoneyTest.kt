import org.example.Dollar
import org.example.Franc
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

class MoneyTest {

    @Test
    fun `test multiplication`() {
        val five = Dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun `test equality`() {
        assertEquals(Dollar(5), Dollar(5))
        assertNotEquals(Dollar(5), Dollar(6))

        assertEquals(Franc(5), Franc(5))
        assertNotEquals(Franc(5), Franc(6))

        assertFalse(Franc(5).equals(Dollar(5)))
    }

    @Test
    fun `test frank multiplication`() {
        val five = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }

}