package interactive;

import static org.junit.Assert.*;

import org.junit.Test;

import core.Pokemon;
import core.Species;

public class PlayerTest {
	@Test
	public void testPlayer() {
		Player ashe = new Player("Ashe Ketchup");
		Pokemon pokimao = new Pokemon(Species.PICHU, 98);
		assertTrue(ashe.isPartyEmpty());
		System.out.println(ashe.getBag() + " " + ashe.getMoney() + "" + ashe.getName() + "" + ashe.getParty());
		assertTrue(ashe.addToParty(pokimao));
		assertTrue(ashe.addToParty(pokimao));
		assertTrue(ashe.addToParty(pokimao));
		assertFalse(ashe.isInBattle());
		
		ashe.setBattleState(false);
		assertTrue(ashe.addToParty(null));
		
		assertEquals(ashe.swapSlots(2, 6),false);
		assertTrue(ashe.swapSlots(1, 2));
		ashe.toString();
		
	}
}
