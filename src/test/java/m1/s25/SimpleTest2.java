package m1.s25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class SimpleTest2 {

	@Test
	void negatePlain() {
		//fail dice che il test fallirà sempre, fail è un metodo statico della classe Assertions
		//fail("Not yet implemented");
		Simple simple = new Simple();
		int value = 42;
		int expected = -42;
		
		int actual = simple.negate(value);
		//Junit 4
		//assertEquals(expected, actual);
		
		//Junit Jupyter
		assertThat(actual, equalTo(expected));
		
		
	}

}
