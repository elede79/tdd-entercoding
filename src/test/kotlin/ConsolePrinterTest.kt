import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class ConsolePrinterTest {
    private lateinit var outputStream: ByteArrayOutputStream
    private lateinit var  consolePrinter: ConsolePrinter

    @BeforeEach
    fun setup(){
        outputStream = ByteArrayOutputStream()
        consolePrinter = ConsolePrinter()
    }
    @Test
    fun `print Message`(){
       //given
        System.setOut(PrintStream(outputStream))
        //when
        consolePrinter.printMessage("Hello world")
        val result = outputStream.toString()
        //Then
        assertEquals(
            "Hello world",
            result
        )
    }

}