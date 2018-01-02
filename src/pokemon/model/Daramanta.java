package pokemon.model;

public class Daramanta extends Pokemon implements Fire
{
	public Daramanta()
	{
		super(854, "Daramanta");
		setup();
	}
	
	public Daramanta(String name)
	{
		super(854, name);
		setup();
	}
	
	public Daramanta(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(5);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(10);
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
