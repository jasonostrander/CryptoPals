
import org.junit.Test
import java.io.File

/**
 * Created by j.ostrander on 3/17/17.
 */

class Challenge4 {
    fun findXorSingleCharText(input: ByteArray): Pair<String, Double> {
        return (0..0x7f).map { "$it".repeat(input.size).toHexByteArray() }
                .map { String(xor(input, it)) }
                .map { Pair(it, characterFrequencyScore(it)) }
                .sortedBy { it.second }
                .first()
    }

    @Test
    fun challenge4() {
        val lines = File("src/challenge4.txt").readLines()
        val result = lines.map(String::toHexByteArray)
                .map { findXorSingleCharText(it) }
                .sortedBy { it.second }
                .get(2).first
        println(result)
    }
}