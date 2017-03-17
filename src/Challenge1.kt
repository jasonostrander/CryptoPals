import junit.framework.Assert.assertEquals
import org.junit.Test
import java.util.*
import javax.xml.bind.DatatypeConverter

/**
 * Created by j.ostrander on 3/13/17.
 */
class Challenge1 {
    @Test
    fun base64Test() {
        val s = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d"
        val result = String(Base64.getEncoder().encode(DatatypeConverter.parseHexBinary(s)))
        println(String(DatatypeConverter.parseHexBinary(s)))
        assertEquals(result, "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t")
    }
}