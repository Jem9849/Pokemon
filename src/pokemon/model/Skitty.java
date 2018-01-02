package pokemon.model;

public class Skitty extends Pokemon implements Normal
{
	
	public Skitty()
	{
		super(300, "Skitty");
		setup();
	}
	
	public Skitty(String name)
	{
		super(300, name);
		setup();
	}
	
	public Skitty(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(45);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(50);
	}
	
	
	public String Wish()
	{
		return "Wishes for the entire opponent team to die. It usually works.";
	}
	public String Substitute()
	{
		return "Uses its tail as a substitute. Not very useful.";
	}
	public String Sing()
	{
		return "You ever heard a cat sing? It is pretty.";
	}
}
