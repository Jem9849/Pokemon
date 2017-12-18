package pokemon.model;

public class FarmerWithAShotgun extends Pokemon implements Ice, Normal
{
	public FarmerWithAShotgun(int number, String name)
	{
		super(number, name);
	}
	
	public String Wish()
	{
		return "Heals HP completely.";
	}
	
	public String Substitute()
	{
		return "Throw in a substitute doll to take damage.";
	}
	
	public String Sing()
	{
		return "Put enemies to sleep.";
	}
	
	public String sheerCold()
	{
		return "Barely hurts anyone using cold.";
	}
	public String blizzard()
	{
		return "ELSA? DO YOU WANT TO BUILD A SNOWMAN.";
	}
	public String iceBeam()
	{
		return "Throws of beam of ice bucket challenges at the opponent.";
	}
}
