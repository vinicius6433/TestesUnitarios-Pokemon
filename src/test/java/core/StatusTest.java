package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatusTest {
	@Test 
	public void statusTest() {
		for(Status st: Status.values()) {
			System.out.println(st + " " + st.toString());
		}
		assertEquals(Status.POISON.toString(),"POISON");
		assertEquals(Status.PARALYZE.toString(),"PARALYZE");
		assertEquals(Status.BURN.toString(),"BURN");
		assertEquals(Status.FREEZE.toString(),"FREEZE");
		assertEquals(Status.SLEEP.toString(),"SLEEP");
		assertEquals(Status.SEED.toString(),"SEED");
		assertEquals(Status.ACCURACY.toString(),"ACCURACY");
	}
}
