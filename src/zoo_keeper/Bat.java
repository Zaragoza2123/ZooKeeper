package zoo_keeper;

public class Bat extends Mammal{
	private int energyLevel = 300;
	
	public void fly()
	{
		System.out.println("Whoosh Whoosh Whoosh");
		super.loseEnergy(50);;
	}
	public void eatHumans()
	{
		System.out.println("Nom Nom Nom");
		super.gainEnergy(25);;
	}
	public void attackTown()
	{
		System.out.println("Towns set a blaze fire fire fire");
		super.loseEnergy(100);;
	}
}
