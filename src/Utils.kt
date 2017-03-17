import javax.xml.bind.DatatypeConverter
import kotlin.experimental.xor

/**
 * Created by j.ostrander on 3/13/17.
 */

fun String.toHexByteArray(): ByteArray {
    return if (this.length % 2 == 0) {
        DatatypeConverter.parseHexBinary(this)
    } else {
        DatatypeConverter.parseHexBinary(this.prependIndent("0"))
    }
}
fun ByteArray.toHexSring(): String = DatatypeConverter.printHexBinary(this)

fun xor(a: ByteArray, b: ByteArray): ByteArray {
    return a.zip(b).map { it.first.xor(it.second) }.toByteArray()
}

val charFreq = mapOf(
        'e' to 0.127,
        't' to 0.091,
        'a' to 0.082,
        'o' to 0.075,
        'i' to 0.07,
        'n' to 0.067,
        's' to 0.063,
        'h' to 0.061,
        'r' to 0.06,
        'd' to 0.043,
        'l' to 0.04,
        'u' to 0.028,
        'c' to 0.028,
        'm' to 0.024,
        'w' to 0.024,
        'f' to 0.022,
        'y' to 0.02,
        'g' to 0.02,
        'p' to 0.019,
        'b' to 0.015,
        'v' to 0.01,
        'k' to 0.008,
        'x' to 0.002,
        'j' to 0.002,
        'q' to 0.001,
        'z' to 0.001
)
val firstCharFreq = mapOf('a' to 0.116, 'i' to 0.063, 'o' to 0.063, 'e' to 0.020, 'u' to 0.015)

fun characterFrequencyScore(s: String): Double {
    val charFreq = s.toLowerCase()
            .groupBy { it }
            .map { Pair(it.key, it.value.size.toDouble()/s.length) }
            .map { Math.abs(charFreq.getOrDefault(it.first, 0.0) - it.second) }
            .sum()
    val firstFreqList = s.toLowerCase()
            .split(" ")
            .filter { it.length > 0 }
            .map(String::first)
    val firstFreq = firstFreqList
            .groupBy { it }
            .map { Pair(it.key, it.value.size.toDouble()/firstFreqList.size) }
            .map { Math.abs(firstCharFreq.getOrDefault(it.first, 0.0) - it.second) }
            .sum()
    return (charFreq + firstFreq)/2
}
