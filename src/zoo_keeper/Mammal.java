package zoo_keeper;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergy()
	{
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
	public void loseEnergy(int num)
	{
		energyLevel -= num;
	}
	public void gainEnergy(int num)
	{
		energyLevel += num;
	}
	
}
