import org.junit.Test

/**
 * Created by j.ostrander on 3/14/17.
 */

class Challenge3 {
    @Test
    fun singleByteXor() {
        val input = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736"
        for (ch in "0123456789abcdef".toList()) {
            println(String(xor(input.toHexByteArray(), (1..input.length).map { ch.toByte() }.toByteArray())))
        }
    }
}