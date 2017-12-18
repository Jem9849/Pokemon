package pokemon.model;

public class LittleBoy extends Pokemon implements Fire
{
	public LittleBoy(int number, String name)
	{
		super(number, name);
	}
	
	public String fireBlast()
	{
		return "A distant cloud of smoke scrapped the air as the roaring sound of distance destroyed approached. A blast of flame and radiation is eating the ground. Are we doomed?";
	}
	public String flameThrower()
	{
		return "We sickly run. Running away from the spewing fire that breeds quickly as it torches every building and every home.";
	}
	public String flamePledge()
	{
		return "Fire is gone now, and all we are left with is radiation and rubble. We pledge to make them pay.";
	}
}