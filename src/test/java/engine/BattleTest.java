package engine;

import static org.junit.Assert.*;

import org.junit.Test;

import core.Move;
import core.Pokemon;
import core.Species;
import interactive.Player;

public class BattleTest {
	
	@Test
	public void testBattle() {
		byte f = 100;
		
		for(Move mv: Move.values()) {
			Pokemon pokimaoComLevel98 = new Pokemon(Species.PICHU, 98); 
			Player ashe = new Player("Ashe Ketchup");
			ashe.addToParty(pokimaoComLevel98);
			Battle bt = new Battle(ashe, pokimaoComLevel98);
			mv.addPP(100);
			bt.useMove(mv);
			mv.setPP(f);
			mv.addPP(200);
			bt.useMove(mv);
			bt.setRunning(false);
			bt.isRunning();
//			Battle.applyStatus(mv, pokimaoComLevel98);
			System.out.println(bt.toString());
		}
		
		
		
	}
}
