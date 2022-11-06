package pokedex;

import org.junit.Test;

import core.Pokemon;
import core.Species;
import core.Type;

public class PokedexTest {

	@Test
	public void testPokedex() {
		for(Species sp : Species.values()) {
			Pokemon pokimao = new Pokemon(Species.PICHU, 98);
			Pokedex pd = new Pokedex(sp.toString());
			pd.searchByName("PICHU");
			pd.searchByName("BULBASAUR");
			pd.searchByType(Type.ELECTRIC);
			pd.displaySprite(pokimao);
		}
	}
}
