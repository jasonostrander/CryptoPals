
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Created by j.ostrander on 3/13/17.
 */
class Challenge2 {
    val a = "1c0111001f010100061a024b53535009181c"
    val b = "686974207468652062756c6c277320657965"

    @Test
    fun testXor() {
        val result = xor(a.toHexByteArray(), b.toHexByteArray()).toHexSring()
        println(String(result.toHexByteArray()))
        assertTrue(result.equals("746865206b696420646f6e277420706c6179", ignoreCase = true))
    }
}