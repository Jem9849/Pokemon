package pokemon.controller;

import pokemon.model.Pokemon;
import java.util.List;
import java.util.ArrayList;
import pokemon.model.*;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		this.pokedex = new ArrayList<Pokemon>(6);
		appFrame = new PokemonFrame(this);
		
		
		buildPokedex();
		
		
	}
	
	public void buildPokedex()
	{
		
		Pokemon poke = new Pokemon("Daramanta");
		Pokemon poke2 = new Pokemon("FarmerWithAShotgun");
		Pokemon poke3 = new Pokemon("Fluffalo");
		Pokemon poke4 = new Pokemon("LittleBoy");
		Pokemon poke5 = new Pokemon("MultiHyperRareGodArceusThriceBlessedHolyGoat");
		Pokemon poke6 = new Pokemon("Skitty");
		
		
		pokedex.add(poke);
		pokedex.add(poke2);
		pokedex.add(poke3);
		pokedex.add(poke4);
		pokedex.add(poke5);
		pokedex.add(poke6);
	}
	
		public List<Pokemon> getPokedex()
		{	
			return pokedex;
		}
		
		public boolean isValidInteger(String input)
		{
			boolean valid = false;
			
			try
			{
				Integer.parseInt(input);
				valid = true;
			}
			
			catch(NumberFormatException error)
			{
				System.out.println("You need to input an int, " + input + " is not valid.");
			}
			
			return valid;
		}
		
		public boolean isValidDouble(String input)
		{
			boolean validation = false;
			
			try
			{
				Double.parseDouble(input);
				validation = true;
			}
			
			catch(NumberFormatException error)
			{
				System.out.println("You need to input a double, " + input + " is not valid.");
			}
			
			return validation;
		}
}
