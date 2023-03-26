package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(10,5);
		assertEquals(2, output);
	}

}
