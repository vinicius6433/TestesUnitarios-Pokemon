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
			// validando se a classe core.Ability est� recebendo os devidos valores
			System.out.println(ab);
			//testando se todos os valores est�o sendo passados pelo m�todo getDescription, e validando se o nome aparece tipo aparece com o toString
			System.out.println("Nome: "+ ab.toString() + " Descri��o: "+ ab.getDescription());
			// verificando se os valores s�o diferentes
			assertNotEquals(ab.toString(), ab.getDescription());
			
		}
		
		
	}
}
