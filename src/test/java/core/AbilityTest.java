package core;

import static org.junit.Assert.*;
import org.junit.Test;

public class AbilityTest {
	@Test
	public void testAbility() {
		
		Ability ad = Ability.ADAPTABILITY;
		
		assertEquals(ad.toString(), "ADAPTABILITY");
		assertEquals(ad.getDescription(), "Powers up moves of the same type.");
		// testando grande quantidade de dados
		for(Ability ab : Ability.values()) {
			// validando se a classe core.Ability está recebendo os devidos valores
			System.out.println(ab);
			//testando se todos os valores estão sendo passados pelo método getDescription, e validando se o nome aparece tipo aparece com o toString
			System.out.println("Nome: "+ ab.toString() + " Descrição: "+ ab.getDescription());
			// verificando se os valores são diferentes
			assertNotEquals(ab.toString(), ab.getDescription());
			
		}
		
		
	}
}
