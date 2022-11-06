package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PokemonTest {
	@Test
	public void testPokemon() {
		final Stat a = Stat.ATTACK;
		
		Pokemon vouLHeMatarPokimao = new Pokemon("AGGRON",Species.AGGRON); 
		Pokemon pokimao = new Pokemon(Species.AGGRON); 
		Pokemon pokimaoComLevel = new Pokemon(Species.PICHU, 6); 
		Pokemon pokimaoComLevel98 = new Pokemon(Species.PICHU, 98); 
		
		pokimaoComLevel.setLevel(97);
		pokimao.setLevel(1);
		pokimaoComLevel.resetStats();
		pokimaoComLevel.takeDamage(100);
		pokimaoComLevel.takeDamage(-20000);
		
		pokimaoComLevel.getMoveSet();
		pokimaoComLevel.getInBattleStat(a);
		pokimaoComLevel.getCurrentStat(a);
		pokimaoComLevel.getInBattleHp();
		pokimaoComLevel.addExp(1000000);
		pokimaoComLevel.levelUp();
		System.out.println(pokimaoComLevel.getType().toString());
		System.out.println(pokimaoComLevel.getExpYield());
		System.out.println(pokimaoComLevel.getMoveSet().toString());
		System.out.println(pokimaoComLevel.isFainted());
		System.out.println(pokimaoComLevel.getStatus().toString());
		System.out.println(pokimao.getGender() + " " + pokimao.getName() + " " + pokimao.getNickname() +" "+ pokimao.getLevel() );
		pokimao.toString();
	}
}
