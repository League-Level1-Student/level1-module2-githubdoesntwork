package sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature bob = new SeaCreature("Spongebob");
	SeaCreature pat = new SeaCreature("Patrick");
	SeaCreature squid = new SeaCreature("Squidward");
	String bobname = bob.getName();
	System.out.println(bobname);
	bob.eat();
	bob.laugh();
	String patname = pat.getName();
	System.out.println(patname);
	pat.eat();
	pat.laugh();
	String squidname = squid.getName();
	System.out.println(squidname);
	squid.eat();
	squid.laugh();
}
}
