package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class TypeTest {

	@Test
	public void typeTest() {
		for(Type tp: Type.values()) {
			System.out.println(tp);
			Type dk = Type.DARK;
			dk.isSuperEffectiveAgainst(dk);
			dk.isNotVeryEffectiveAgainst(dk);
			dk.hasNoEffectOn(dk);
			dk.isNormalAgainst(dk);
			Type.FLYING.isNormalAgainst(Type.BUG);
			dk.getTypesNoEffectAgainst();
			
			
			assertFalse(dk.isSuperEffectiveAgainst(dk));
			assertTrue(dk.isNotVeryEffectiveAgainst(dk));
			assertFalse(dk.hasNoEffectOn(dk));
			assertFalse(dk.isNormalAgainst(dk));
			assertTrue(Type.FLYING.isNormalAgainst(Type.BUG));
			System.out.println(dk.getTypesNoEffectAgainst().toString());
		}
	}
}
