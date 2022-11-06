package core;

import static org.junit.Assert.*;

import javax.xml.crypto.dsig.dom.DOMValidateContext;

import org.junit.Test;

public class MoveTest {
	
	
	@Test
	public void testMove() {
		byte a = 1,b = 2, c = 3, d = 4;
		
//		testes unicos
		Move move = Move.POUND;
		move.setPP(d);
		
		
		// modificando status		
		move.addPP(50);
		
		move.downPP();
		
		System.out.println(move.getName());
//		System.out.println(move.getType());
		System.out.println(move.getAccuracy());
		System.out.println(move.getCurrentPP());
		System.out.println(move.getTotalPP());
		System.out.println(move.getPower());
		System.out.println(move.getMoveType());
		System.out.println(move.getStatusEffect());
		// finalizando status
		move.resetAccuracy();
		move.resetPP();
		System.out.println(move.getCurrentPP());
		System.out.println(move.getTotalPP());
		
		assertEquals(move.getName(), "Pound");
		assertEquals(move.getType().toString(), "NORMAL");
		assertEquals(move.getAccuracy(), 100);
		assertEquals(move.getCurrentPP(), 35);
		assertEquals(move.getTotalPP(), 35);
		assertEquals(move.getPower(), 40);
		assertEquals(move.getMoveType().toString(), "PHYSICAL");
		assertEquals(move.getStatusEffect(), null);
		assertEquals(move.getCurrentPP(), 35);
		assertEquals(move.getTotalPP(), 35);
		// testes em massa
		for(Move mv: Move.values()) {
			// verificando status 
			System.out.println(mv.toString());
			// setando valores
			mv.setPP(d);
			
					
			// modificando status		
			mv.addPP(50);
			
			mv.downPP();
			
			
			//recuperando status
			System.out.println(mv.getName());
			System.out.println(mv.getType());
			System.out.println(mv.getAccuracy());
			System.out.println(mv.getCurrentPP());
			System.out.println(mv.getTotalPP());
			System.out.println(mv.getPower());
			System.out.println(mv.getMoveType());
			System.out.println(mv.getStatusEffect());
			// finalizando status
			mv.resetAccuracy();
			mv.resetPP();
			System.out.println(mv.getCurrentPP());
			System.out.println(mv.getTotalPP());
			
		}
		
	}
}
