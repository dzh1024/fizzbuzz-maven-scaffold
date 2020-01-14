
import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void fizzBuzzTest() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(FizzBuzz.getStr(i));
		}
	}
}
