package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpeciesTest {
	@Test
	public void testSpecies() {

		byte level = 5;
		
		Species gen1 = Species.ALOMOMOLA;
		Species gen12 = Species.IVYSAUR;
		Species gen123 = Species.VENUSAUR;
		
		Species gen2 = Species.CHIKORITA;
		Species gen23 = Species.BAYLEEF;
		Species gen234 = Species.MEGANIUM;
		
		
		assertEquals(gen1.getBaseStat(level), 65);
		assertEquals(gen1.getCatchRate(), 75);
		assertEquals(gen1.getDexNumber().toString(), "594");
		assertEquals(gen1.getExpYield(), 165);
		assertEquals(gen1.getName().toString(), "Alomomola");
		//gen 1 
		System.out.println(gen1.getBaseStat(level) + " " +  gen12.getBaseStat(level) +" " + gen123.getBaseStat(level));
		System.out.println(gen1.getCatchRate() +" " + gen12.getCatchRate() + " " +gen123.getCatchRate());
		System.out.println(gen1.getDexNumber().toString() + " " +gen12.getDexNumber().toString() +" " + gen123.getDexNumber().toString());
		System.out.println(gen1.getExpYield() +" " + gen12.getExpYield()  +" " + gen123.getExpYield());
		System.out.println(gen1.getName().toString() +" " + gen12.getName().toString()+" " + gen123.getName().toString());
		
		System.out.println(gen1.getEVYields() + " " + gen12.getEVYields() +"" + gen123.getEVYields());
		System.out.println(gen1.getGender());
		System.out.println(gen1.getLearnset().toString());
		
		System.out.println(gen1.getYield(level));
		System.out.println(gen1.getType());
		
		
	
		gen1.calculateExp(level);
		System.out.println(gen123.hasEvolutions());
		
		
		if(gen1.getGender().toString() == "FEMALE") {
			assertEquals(gen1.getGender().toString(), "FEMALE");			
		}else if (gen1.getGender().toString() == "MALE"){
			assertEquals(gen1.getGender().toString(), "MALE");
		}else if(gen1.getGender().toString() == "GENDERLESS") {
			assertEquals(gen1.getGender().toString(), "GENDERLESS");
		}else {
			System.out.println(gen1.getGender().toString());
		}
		
		for (Species sp2 : Species.values()) {
			sp2.toString();
		}
		
	}
}
