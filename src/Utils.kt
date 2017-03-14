import javax.xml.bind.DatatypeConverter
import kotlin.experimental.xor

/**
 * Created by j.ostrander on 3/13/17.
 */

fun toByteArray(s: String): ByteArray = DatatypeConverter.parseHexBinary(s)
fun toHexSring(b: ByteArray): String = DatatypeConverter.printHexBinary(b)

fun xor(a: String, b: String): ByteArray {
    val hexa = toByteArray(a)
    val hexb = toByteArray(b)
    return hexa.zip(hexb).map { it.first.xor(it.second) }.toByteArray()
}

