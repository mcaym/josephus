import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.*;

public class RedirectTester_junit4 {

	private ByteArrayOutputStream output = new ByteArrayOutputStream();
	private ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();

    private String lineseparator = System.getProperty("line.separator");
     
@Before
	public void setup() {
		System.setOut(new PrintStream(output));
		System.setErr(new PrintStream(errorOutput));
	} // end @Before method

	@Test
	public void testStdOut() {
		System.out.println("hello");
		assertEquals("hello" + lineseparator, output.toString());
	}

	@Test
	public void testStdErr() {
		System.err.println("good bye");
		assertEquals("good bye" + lineseparator, errorOutput.toString());
	}


	@After
	public void resetStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
	} // end @After method

} // end class RedirectTester

