import org.junit.Assert
import org.junit.Test

/**
 * Created by j.ostrander on 3/14/17.
 */

class Challenge3 {
    @Test
    fun singleByteXor() {
        val input = "1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736".toHexByteArray()
        val result = (0..0x7f).map { "$it".repeat(input.size).toHexByteArray() }
                .map { String(xor(input, it)) }
                .map { Pair(it, characterFrequencyScore(it)) }
                .sortedBy { it.second }
                .first()
        println(result.first)
        Assert.assertEquals("Cooking MC's like a pound of bacon", result.first)
    }
}