package pokemon.model;

public class Fluffalo extends Pokemon implements Normal
{
	public Fluffalo(int number, String name)
	{
		super(number, name);
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
