package engine;

import static org.junit.Assert.*;

import org.junit.Test;

import interactive.Player;

public class PowerHouseTest {
	@Test
	public void testPowerHouse() {
		Powerhouse ph = new Powerhouse();
		Player ashe = new Player("Ashe Ketchup");
		System.out.println(Powerhouse.welcomeScreen());
		Powerhouse.regionOption("KANTO");
		Powerhouse.regionOption("JOHTO");
		Powerhouse.regionOption("HOENN");
		Powerhouse.regionOption("SINNOH");
		Powerhouse.regionOption("UNOVA");
		try{
			Powerhouse.regionOption("PALLET");
		}catch (IllegalArgumentException e) {
			System.out.println("PALLET somehow bypassed the region check");
		}
		Powerhouse.main(ashe, "KANTO", "Pichu");
		
	}
}
