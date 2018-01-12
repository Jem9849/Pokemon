package pokemon.controller;

import pokemon.model.Pokemon;
import java.util.List;
import java.util.ArrayList;
import pokemon.model.*;
import pokemon.view.PokemonFrame;

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
	
	public void start()
	{
		
	}
	
	public void buildPokedex()
	{
		
		pokedex.add(new Daramanta());
		pokedex.add(new FarmerWithAShotgun());
		pokedex.add(new Skitty());
		pokedex.add(new LittleBoy());
		pokedex.add(new MultiHyperRareGodArceusThriceBlessedHolyGoat());
		pokedex.add(new Fluffalo());
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
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
