package extra;

import java.util.Scanner;

public class Adventure {
	static boolean king = false;
	static int health = 20;
	static String weapon = "stick";
	static int weaponDamage = 2;
	static String answer;
	static String enemyWeapon;
	static int fame =0;
	static int money = 100;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i > 0;) {
			if(health<1) {
				System.out.println("You died. (ಥʖ̯ಥ)");
				System.exit(0);
				break;
			}
												System.out.println("---------------------------------");
												System.out.println("Your health is " + health + ".");
												System.out.println();
												System.out.println("You arrive at a town.");
												System.out.println("There is a man standing at the gate.");
												System.out.println();
												System.out.println("What do you do?");
												System.out.println();
												System.out.println("1. Talk");
												System.out.println("2. Sneak past him");
												System.out.println("3. Attack him");
												System.out.println("4. See inventory");
												System.out.println("---------------------------------");
			answer = scan.nextLine();
			if (answer.contentEquals("1")) {
				answer="0";
			for (int j = 1; j > 0;) {
		
												System.out.println("---------------------------------");
												System.out.println("Your health is " + health + ".");
												System.out.println();
												System.out.println("Guard: You cannot pass.");
												System.out.println();
												System.out.println("1. Get angry");
												System.out.println("2. Go back");
					answer = scan.nextLine();
					if (answer.contentEquals("1")) {
						answer="0";
												System.out.println("---------------------------------");
												System.out.println("You got angry at the guard and he kicked you.");
												System.out.println("Guard: Watch your feet!");
												health = health - 1;
												System.out.println("Ow. You health is now " + health + ". (ಥʖ̯ಥ)");
												if(health<1) {
													System.out.println("You died. (ಥʖ̯ಥ)");
													System.exit(0);
												}
					}
					else if(answer.contentEquals("2")) {
						answer="0";
						break;
						
					}
				}
			}
			if (answer.contentEquals("2")) {
				answer="0";
				for (int j2 = 1; j2 > 0;) {

												System.out.println("---------------------------------");
												System.out.println("You tried to sneak past the guard, but he sees you");
												System.out.println("out of the corner of his eye.");
												System.out.println();
												System.out.println("Guard: Get back here! You may not pass!");
												System.out.println("He kicks you.");
												health=health-1;
												System.out.println("Ow. Your health is now "+health+". (ಥʖ̯ಥ)");
												if(health<1) {
													System.out.println("You died. (ಥʖ̯ಥ)");
													System.exit(0);
												}
												System.out.println();
												System.out.println("1. Keep running");
												System.out.println("2. Go back");
												System.out.println("---------------------------------");
						answer=scan.nextLine();
						if (answer.contentEquals("2")) {
							answer="0";
							break;
						
						}else if(answer.contentEquals("1")) {
												System.out.println("---------------------------------");
												enemyWeapon="sword";
												System.out.println("Guard: Hey!");
												System.out.println("The guard cuts you in the stomach with his "+enemyWeapon+". (∩ ͡° ͜ʖ ͡°)⊃-(===>");
												System.out.println();
												health=health-10;
												System.out.println("Yeowch! You health is now "+health+". (ಥʖ̯ಥ)");
												break;
						}	
						if(health<1) {
							System.out.println("You died. (ಥʖ̯ಥ)");
							System.exit(0);
						}
						
				}
				}
			if(answer.contentEquals("3")) {
				System.out.println("---------------------------------");
				System.out.println("You wield a "+weapon+", and it deals "+weaponDamage+" damage.");
				int guardHealth=100;
				guardHealth=guardHealth-weaponDamage;
				System.out.println("The guard's health is now "+guardHealth+".");
				guardHealth=100;
				System.out.println("The guard glugs a potion and heals to full health.");
				System.out.println("(Stop trying, he has infinite potions)  (˘-˘) ");
				System.out.println();
				enemyWeapon="sword";
				System.out.println("Guard: Ow! Embrace my iron!");
				System.out.println("The guard retaliates by stabbing you with his "+enemyWeapon+".  (∩ ͡° ͜ʖ ͡°)⊃-(===>");
				health=health-10;
				System.out.println("Your health is now "+health+". (ಥʖ̯ಥ)");
				System.out.println();
			}
			if(health<1) {
				System.out.println("You died. (ಥʖ̯ಥ)");
				System.exit(0);
			}
			if (answer.contentEquals("4")) {
				System.out.println("---------------------------------");
				System.out.println("HP: "+health);
				System.out.println("Money: "+money);
				System.out.println("Fame: "+fame);
				System.out.println("Weapon: "+weapon+" - Damage per hit: "+weaponDamage);
			}
		
	}
}
}
