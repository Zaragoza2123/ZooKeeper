package zoo_keeper;

public class Gorilla extends Mammal {
	
	public void throwSomething()
	{
		System.out.println("Gorilla has thrown his poop at you.");
		super.loseEnergy(5);;
	}
	
	public void eatBananas()
	{
		System.out.println("Gorilla has eaten the banana with the peel, OOOOooooooOoooo!");
		super.gainEnergy(10);
	}
	
	public void climb()
	{
		System.out.println("Gorilla has climb the tree in search of targets.");
		super.loseEnergy(10);
	}
	
}
