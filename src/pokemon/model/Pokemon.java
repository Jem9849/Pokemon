package pokemon.model;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon (int number, String name)
	{
		this.name  = name;
		this.number = number;
	}
	
	public final String[] getPokemonTypes()
	{
		
	}
	
	public String toString()
	{
		String description = "Hi, I am a " + name + ", and my HP is" + healthPoints;
		
		return description;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
}
