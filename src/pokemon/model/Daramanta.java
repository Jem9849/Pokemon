package pokemon.model;

public class Daramanta extends Pokemon implements Fire
{
	public Daramanta(int number, String name)
	{
		super(number, name);
	}
	
	public String fireBlast()
	{
		return "Singles out the weakest enemy and blows the strongest burst of fire ever. Pure overkill.";
	}
	public String flameThrower()
	{
		return "SH00TS MLG 360 NO SCOPE FLAMES. REKTED!";
	}
	public String flamePledge()
	{
		return "Pillars of flame. Nice decoration, bad idea.";
	}
}
