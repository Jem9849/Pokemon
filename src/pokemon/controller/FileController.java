package pokemon.controller;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import pokemon.model.Pokemon;
import java.util.Scanner;



public class FileController 
{
	public static void savePokemonToFile(ArrayList<Pokemon> pokedex)
	{
		File saveFile = new File("Saved Pokedex.txt");
		try
		{
			PrintWriter writeToDisk = new PrintWriter(saveFile);
			
			for (int index = 0; index < pokedex.size(); index++)
			{
				String name = pokedex.get(index).getName();
				int number = pokedex.get(index).getNumber();
				int attack = pokedex.get(index).getAttackPoints();
				int health = pokedex.get(index).getHealthPoints();
				boolean evolve = pokedex.get(index).isCanEvolve();
				double modify = pokedex.get(index).getEnhancementModifier();
				
				String row = name + "," + number + "," + health + "," + attack + "," + modify + "," + evolve;
				
				
			}
			writeToDisk.close();
		}
		catch (FileNotFoundException error)
		{
			System.out.println("There as an error:" + error.getMessage());
		}
	}
	
	public static String readPokemonFromFile
	{
		
	}
}
