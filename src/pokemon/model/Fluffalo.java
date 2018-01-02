package pokemon.model;

public class Fluffalo extends Pokemon implements Normal
{
	public Fluffalo()
	{
		super(944, "Fluffalo");
		setup();
	}
	
	public Fluffalo(String name)
	{
		super(944, name);
		setup();
	}
	
	public Fluffalo(int number, String name)
	{
		super(number, name);
	}
	
	protected void setup()
	{
		this.setAttackPoints(137);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(400);
	}
	
	public String Wish()
	{
		return "Wishes for a fluffier coat of fur.";
	}
	
	public String Substitute()
	{
		return "Becomes its own substitute by substituting for itself.";
	}
	
	public String Sing()
	{
		return "Put enemies to sleep.";
	}
	
}
