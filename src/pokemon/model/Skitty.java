package pokemon.model;

public class Skitty extends Pokemon implements Normal
{
	public Skitty(int number, String name)
	{
		super(number, name);
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
