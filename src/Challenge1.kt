
import java.util.*
import javax.xml.bind.DatatypeConverter

/**
 * Created by j.ostrander on 3/13/17.
 */
fun main(args: Array<String>) {
    val s = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d"
    val result = Base64.getEncoder().encode(DatatypeConverter.parseHexBinary(s))
    println(String(result))
}