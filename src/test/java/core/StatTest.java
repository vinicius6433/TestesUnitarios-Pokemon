package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatTest {
	@Test
	public void statTest() {
		
		assertEquals(Stat.HP.toString(),"Hp");
		assertEquals(Stat.ATTACK.toString(),"Attack");
		assertEquals(Stat.DEFENSE.toString(),"Defense");
		assertEquals(Stat.SP_ATTACK.toString(),"Sp_attack");
		assertEquals(Stat.SP_DEFENSE.toString(),"Sp_defense");
		assertEquals(Stat.SPEED.toString(),"Speed");
		for(Stat st: Stat.values()) {
			System.out.println(st +st.toString());
			
		}
	}
}
