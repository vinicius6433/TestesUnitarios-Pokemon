package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NatureTest {
	@Test
	public void testMoveType() {
		Nature nature = Nature.ADAMANT;		
		assertEquals(nature.toString(), "ADAMANT");
		assertEquals(nature.getStatIncreased().toString(), "Attack");
		assertEquals(nature.getStatDecreased().toString(), "Sp_attack");
		for(Nature nt: Nature.values()) {
			System.out.println(nt);
			System.out.println(nt.getStatIncreased());
			System.out.println(nt.getStatDecreased());
		}
	}
}
