package core;

import static org.junit.Assert.*;
import org.junit.Test;

public class GenderTest {
	@Test
	public void testGender() {

		for(Gender ge: Gender.values()) {
			System.out.println(ge);
		}
	
		assertEquals(Gender.FEMALE.toString(),"FEMALE");
		assertEquals(Gender.MALE.toString(),"MALE");
		assertEquals(Gender.GENDERLESS.toString(),"GENDERLESS");
	}
}

