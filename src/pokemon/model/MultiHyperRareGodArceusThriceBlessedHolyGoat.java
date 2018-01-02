package pokemon.model;

public class MultiHyperRareGodArceusThriceBlessedHolyGoat extends FarmerWithAShotgun implements Ice, Fire
{
	public MultiHyperRareGodArceusThriceBlessedHolyGoat()
	{
		super(5000, "MultiHyperRareGodArceusThriceBlessedHolyGoat");
		setup();
	}
	
	public MultiHyperRareGodArceusThriceBlessedHolyGoat(String name)
	{
		super(5000, name);
		setup();
	}
	public MultiHyperRareGodArceusThriceBlessedHolyGoat(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(5000000);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.30);
		this.setHealthPoints(1000000);
	}
	
	public String fireBlast()
	{
		return "Inflicts damage of 10 billion. May burn.";
	}
	
	public String flameThrower()
	{
		return "Lightly smokes the enemy.";
	}
	
	public String flamePledge()
	{
		return "Shoots pillars of fire towards the enemy.";
	}
	
	public String sheerCold()
	{
		return "Simply beats the opponent. No ifs, no buts. Get rekted.";
	}
	public String blizzard()
	{
		return "Makes the opponent's kids complain about it being too cold.";
	}
	public String iceBeam()
	{
		return "Shoots a beam of ice that in reality would be a long solid shard of ice that would pierce the enemy very painfully.";
	}
	
	public String Wish()
	{
		return "Wishes for a better team.";
	}
	
	public String Substitute()
	{
		return "Substitute to take a nap.";
	}
	
	public String Sing()
	{
		return "Put enemies to sleep.";
	}
}
