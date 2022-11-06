package interactive;

import org.junit.Test;

import core.Pokemon;
import core.Species;

public class PokecenterTest {
	@Test
	public void testPokecenter() {
		Pokemon pokimao = new Pokemon(Species.AGGRON);
		Player ashe = new Player("Ashe Ketchup");
		Pokecenter.healParty(ashe);
		ashe.addToParty(pokimao);
		Pokecenter.healParty(ashe);
		
		
	}
}
