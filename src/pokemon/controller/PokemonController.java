package pokemon.controller;

import pokemon.model.Pokemon;
import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	private List<Pokemon> pokedex;
	
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
