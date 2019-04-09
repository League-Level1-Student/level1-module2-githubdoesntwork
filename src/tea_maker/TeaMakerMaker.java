package tea_maker;


public class TeaMakerMaker {
	
public static void main(String[] args) {
	TeaBag bag = new TeaBag("mint");
	bag.getFlavor();
	Kettle pot = new Kettle();
	//Water water = pot.getWater();
	pot.boil();
	Cup cup = new Cup();
	cup.makeTea(bag, pot.getWater());
}
}
