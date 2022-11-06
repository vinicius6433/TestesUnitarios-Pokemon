package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoveTypeTest {
	@Test
	public void testMoveType() {
		for(MoveType mt: MoveType.values()) {
			System.out.println(mt);
		}
		
		assertEquals(MoveType.PHYSICAL.toString(),"PHYSICAL");
		assertEquals(MoveType.SPECIAL.toString(),"SPECIAL");
		assertEquals(MoveType.STATUS.toString(),"STATUS");
	}
}
