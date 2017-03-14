import org.testng.Assert
import org.testng.annotations.Test

/**
 * Created by j.ostrander on 3/13/17.
 */
class Challenge2 {
    val a = "1c0111001f010100061a024b53535009181c"
    val b = "686974207468652062756c6c277320657965"

    @Test
    fun testXor() {
        val result = toHexSring(xor(a, b))
        Assert.assertEquals(result, "746865206b696420646f6e277420706c6179")
    }
}