import junit.framework.*;
import org.junit.Test;

public class FizzBuzzTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

    @Test
    public void testFizz() throws Exception {
        assertEquals("fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testBuzz() throws Exception {
        assertEquals("buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz() throws Exception {
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void testN() throws Exception {
        assertEquals("8", FizzBuzz.fizzBuzz(8));
    }
}
