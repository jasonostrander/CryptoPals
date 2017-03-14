import javax.xml.bind.DatatypeConverter
import kotlin.experimental.xor

/**
 * Created by j.ostrander on 3/13/17.
 */

fun String.toHexByteArray(): ByteArray = DatatypeConverter.parseHexBinary(this)
fun ByteArray.toHexSring(): String = DatatypeConverter.printHexBinary(this)

fun xor(a: ByteArray, b: ByteArray): ByteArray {
    return a.zip(b).map { it.first.xor(it.second) }.toByteArray()
}

