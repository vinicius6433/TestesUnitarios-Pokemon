package engine;

import core.Move;
import core.Pokemon;
import core.Species;
import core.Stat;
import interactive.Player;
import interactive.Pokecenter;
import util.WildPokemonGenerator;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Nolan
 * Date: 5/12/13
 * Time: 12:50 PM
 * Starts the game.
 * @version 1
 */
public class Powerhouse {
	public static String welcomeScreen() {
		return ("Welcome to the wonderful world of Pokemon! Our names are Professors Giacone and Hoffmann." +
                "\nOur job is to ensure that you start smoothly on your very own Pokemon Journey!" +
                "\nWe are very fortunate to have recently caught fresh starter Pokemon from each region!" +
                "\nThere are 5 different regions to choose from: Kanto, Johto, Hoenn, Sinnoh, and Unova." +
                "\nYou may only choose a single starter Pokemon, so choose wisely.");        
	}
	
	public static String regionOption(String regioChoosed) {
		byte index;
        String[][] starters = new String[][]{
            {"Bulbasaur", "Charmander", "Squirtle"},
            {"Chikorita", "Cyndaquil", "Totodile"},
            {"Treecko", "Torchic", "Mudkip"},
            {"Turtwig", "Chimchar", "Piplup"},
            {"Snivy", "Tepig", "Oshawott"}};
		
		
		if(regioChoosed.toUpperCase().equals("KANTO")){
      	  index = 0;
        }
        else if(regioChoosed.toUpperCase().equals("JOHTO")) {
      	  index = 1;
        }
        else if(regioChoosed.toUpperCase().equals("HOENN")) {
      	  index = 2;
        }
        else if(regioChoosed.toUpperCase().equals("SINNOH")) {
      	  index = 3;
        }
        else if(regioChoosed.toUpperCase().equals("UNOVA")) {
      	  index = 4;
        }
        else {
      	  throw new IllegalArgumentException(regioChoosed + " somehow bypassed the region check");
        }

      return("Great! You chose the " + regioChoosed + " region!" +
              "\nThe " + regioChoosed + " region has " + Arrays.toString(starters[index]) + " to choose from!" +
              "\nTake your pick!");
	}
	
    public static void main(Player playerName, String regionChoice, String starterChoice) {
        Scanner in = new Scanner(System.in);
        final String[] regions = new String[] {"Kanto", "Johto", "Hoenn", "Sinnoh", "Unova"},
        options = new String[] {"Battle", "Heal", "Quit"};
        System.out.println(welcomeScreen());
        Player p = playerName;
        System.out.print("Okay " + p.getName() + ", let's choose a region. Choose between Kanto, Johto, Hoenn, Sinnoh, and Unova. ");

        String choice = regionChoice;

        System.out.println(regionChoice);
        
        
        choice = starterChoice;


        System.out.println("Congratulations on choosing a " + choice + "!" +
                "\nTake good care of it and have fun on your very own Pokemon journey!");

        p.addToParty(new Pokemon(Species.valueOf(choice.toUpperCase().replace(" ", "_"))));

        boolean quit = false;

        while(!quit)
        {
            do
            {
                System.out.println(p.getParty()[0] + "\nWhat would you like to do?" +
                        "\n" + Arrays.toString(options));
                choice = in.nextLine();
            }
            while(!contains(options, choice));

            
            if(choice.toUpperCase().equals("BATTLE")) {
            	battle(p);
            }
            else if(choice.toUpperCase().equals("HEAL")){
            	Pokecenter.healParty(p);	
            }
            else if(choice.toUpperCase().equals("QUIT")){
            	quit = true;	
            }
            else {
            	throw new IllegalArgumentException(choice + " isn't a choice!");
            }

            System.out.println("\nThanks for playing! We hope to see you again!");
        }
    }

    private static void battle(Player player)
    {
        Scanner in  = new Scanner(System.in);
        Pokemon wild = new WildPokemonGenerator().generatePokemon();

        System.out.println("Encountered a wild " + wild.getName() + "!");

        final Battle battle = new Battle(player, wild);

        while(battle.isRunning())
        {
            System.out.println(battle);
            System.out.println("Move set: " + Arrays.toString(player.getParty()[0].getMoveSet()) + ", type the name of the move you want to use, <Run> to run away.");
            String choice = in.nextLine();

            if(choice.equalsIgnoreCase("Run"))
            {
                //TODO Implement the running away formula
                System.out.println("Got away safely!\n");
                break;
            }

            try
            {
                System.out.println(battle.useMove(Move.valueOf(choice.toUpperCase().replace(" ", "_"))));
            }
            catch(Exception e)
            {
                System.err.println(choice + " is not a valid move");
                e.printStackTrace();
            }
        }
    }

    private static boolean contains(String[] list, String elt)
    {
        for(String s : list)
        {
            if(s.equalsIgnoreCase(elt))
            {
                return true;
            }
        }

        return false;
    }
}
