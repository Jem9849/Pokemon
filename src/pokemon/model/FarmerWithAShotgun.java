package pokemon.model;

public class FarmerWithAShotgun extends Pokemon implements Ice, Normal
{
	public FarmerWithAShotgun()
	{
		super(964, "FarmerWithAShotgun");
		setup();
	}
	
	public FarmerWithAShotgun(String name)
	{
		super(964, name);
		setup();
	}
	
	public FarmerWithAShotgun(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(1337);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.03);
		this.setHealthPoints(1);
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
		return "Throws a beam of ice bucket challenges at the opponent.";
	}
}
