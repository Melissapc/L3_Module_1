package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Intro {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(7,add(5,2));
		
	}
int add(int x, int y) {
	return x+y;
}
}
