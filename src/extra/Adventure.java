package extra;

import java.util.Random;
import java.util.Scanner;

public class Adventure {
	static boolean king = false;
	static int health = 20;
	static String weapon = "stick";
	static int weaponDamage = 2;
	static String answer;
	static String enemyWeapon;
	static int fame = 0;
	static int money = 100;
	static boolean haveJob = false;
	static int intelligence = 20;
	static int hoursLeft = 12;
	static int strength = 3;
	static String jobName = "unemployed man.";
	static boolean haveSword = false;
	static int jobPay = 0;
	static int healthPotions=0;
	static int maxHealthPotions=0;
	static int maxHealth=20;
	static Random rand = new Random();
	static int randInt = rand.nextInt(3);
	static int enemyHealth = 0;
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i > 0;) {
			if (health < 1) { // THIS IS AT THE GATE
				System.out.println("You died. (ಥʖ̯ಥ)");
				System.out.println("Your fame was " + fame + ".");
				if (fame < 10) {
					System.out.println("You were not remembered. No one came to attend your funeral.");
					System.out.println("Actually, you didn't have a funeral.");
				} else if (fame < 30 && fame > 9) {
					System.out.println("A black cat stood on your grave.");
					System.out.println("No one ever visited your tombstone because rumor said it would mean bad luck.");
				} else if (fame < 100 && fame > 29) {
					System.out.println("You had a funeral and people came now and then to respect you.");
				} else if (fame < 300 && fame > 99) {
					System.out.println("You had a well attended burial and many visited you often.");
				} else if (fame > 299) {
					System.out.println("Your legacy will forever echo in time. Hundreds of thousands");
					System.out.println("of people come monthly to see your tombstone.");
				}
				System.exit(0);
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
			System.out.println("5. Bribe him");
			System.out.println("---------------------------------");
			answer = scan.nextLine();
			if (answer.contentEquals("1")) {
				answer = "0";
				for (int j = 1; j > 0;) { // TALK

					System.out.println("---------------------------------");
					System.out.println("Your health is " + health + ".");
					System.out.println();
					System.out.println("Guard: You cannot pass.");
					System.out.println();
					System.out.println("1. Get angry");
					System.out.println("2. Go back");
					answer = scan.nextLine();
					if (answer.contentEquals("1")) {
						answer = "0";
						System.out.println("---------------------------------");
						System.out.println("You got angry at the guard and he kicked you.");
						System.out.println("Guard: Watch your feet!");
						health = health - 1;
						System.out.println("Ow. You health is now " + health + ". (ಥʖ̯ಥ)");
						if (health < 1) {
							System.out.println("You died. (ಥʖ̯ಥ)");
							System.out.println("Your fame was " + fame + ".");
							if (fame < 10) {
								System.out.println("You were not remembered. No one came to attend your funeral.");
								System.out.println("Actually, you didn't have a funeral.");
							} else if (fame < 30 && fame > 9) {
								System.out.println("A black cat stood on your grave.");
								System.out.println(
										"No one ever visited your tombstone because rumor said it would mean bad luck.");
							} else if (fame < 100 && fame > 29) {
								System.out.println("You had a funeral and people came now and then to respect you.");
							} else if (fame < 300 && fame > 99) {
								System.out.println("You had a well attended burial and many visited you often.");
							} else if (fame > 299) {
								System.out.println("Your legacy will forever echo in time. Hundreds of thousands");
								System.out.println("of people come monthly to see your tombstone.");
							}
							System.exit(0);
						}
					} else if (answer.contentEquals("2")) {
						answer = "0";
						break;

					}
				}
			}
			if (answer.contentEquals("2")) {
				answer = "0";
				for (int j2 = 1; j2 > 0;) { // TRYING TO SNEAK

					System.out.println("---------------------------------");
					System.out.println("You tried to sneak past the guard, but he sees you");
					System.out.println("out of the corner of his eye.");
					System.out.println();
					System.out.println("Guard: Get back here! You may not pass!");
					System.out.println("He kicks you.");
					health = health - 1;
					System.out.println("Ow. Your health is now " + health + ". (ಥʖ̯ಥ)");
					if (health < 1) {
						System.out.println("You died. (ಥʖ̯ಥ)");
						System.out.println("Your fame was " + fame + ".");
						if (fame < 10) {
							System.out.println("You were not remembered. No one came to attend your funeral.");
							System.out.println("Actually, you didn't have a funeral.");
						} else if (fame < 30 && fame > 9) {
							System.out.println("A black cat stood on your grave.");
							System.out.println(
									"No one ever visited your tombstone because rumor said it would mean bad luck.");
						} else if (fame < 100 && fame > 29) {
							System.out.println("You had a funeral and people came now and then to respect you.");
						} else if (fame < 300 && fame > 99) {
							System.out.println("You had a well attended burial and many visited you often.");
						} else if (fame > 299) {
							System.out.println("Your legacy will forever echo in time. Hundreds of thousands");
							System.out.println("of people come monthly to see your tombstone.");
						}
						System.exit(0);
					}
					System.out.println();
					System.out.println("1. Keep running");
					System.out.println("2. Go back");
					System.out.println("---------------------------------");
					answer = scan.nextLine();
					if (answer.contentEquals("2")) {
						answer = "0";
						break;

					} else if (answer.contentEquals("1")) {
						System.out.println("---------------------------------");
						enemyWeapon = "sword";
						System.out.println("Guard: Hey!");
						System.out.println(
								"The guard cuts you in the stomach with his " + enemyWeapon + ". (∩ ͡° ͜ʖ ͡°)⊃-(===>");
						System.out.println();
						health = health - 10;
						System.out.println("Yeowch! You health is now " + health + ". (ಥʖ̯ಥ)");
						break;
					}
					if (health < 1) {
						System.out.println("You died. (ಥʖ̯ಥ)");
						System.out.println("Your fame was " + fame + ".");
						if (fame < 10) {
							System.out.println("You were not remembered. No one came to attend your funeral.");
							System.out.println("Actually, you didn't have a funeral.");
						} else if (fame < 30 && fame > 9) {
							System.out.println("A black cat stood on your grave.");
							System.out.println(
									"No one ever visited your tombstone because rumor said it would mean bad luck.");
						} else if (fame < 100 && fame > 29) {
							System.out.println("You had a funeral and people came now and then to respect you.");
						} else if (fame < 300 && fame > 99) {
							System.out.println("You had a well attended burial and many visited you often.");
						} else if (fame > 299) {
							System.out.println("Your legacy will forever echo in time. Hundreds of thousands");
							System.out.println("of people come monthly to see your tombstone.");
						}
						System.exit(0);
					}

				}
			}
			if (answer.contentEquals("3")) {
				System.out.println("---------------------------------");
				System.out.println("You wield a " + weapon + ", and it deals " + weaponDamage + " damage.");
				int guardHealth = 100;
				guardHealth = guardHealth - weaponDamage;
				System.out.println("The guard's health is now " + guardHealth + ".");
				guardHealth = 100;
				System.out.println("The guard glugs a potion and heals to full health.");
				System.out.println("(Stop trying, he has infinite potions)  (˘-˘) ");
				System.out.println();
				enemyWeapon = "sword";
				System.out.println("Guard: Ow! Embrace my iron!");
				System.out.println(
						"The guard retaliates by stabbing you with his " + enemyWeapon + ".  (∩ ͡° ͜ʖ ͡°)⊃-(===>");
				health = health - 10;
				System.out.println("Your health is now " + health + ". (ಥʖ̯ಥ)");
				System.out.println();
			}
			if (health < 1) {
				System.out.println("You died. (ಥʖ̯ಥ)");
				System.out.println("Your fame was " + fame + ".");
				if (fame < 10) {
					System.out.println("You were not remembered. No one came to attend your funeral.");
					System.out.println("Actually, you didn't have a funeral.");
				} else if (fame < 30 && fame > 9) {
					System.out.println("A black cat stood on your grave.");
					System.out.println("No one ever visited your tombstone because rumor said it would mean bad luck.");
				} else if (fame < 100 && fame > 29) {
					System.out.println("You had a funeral and people came now and then to respect you.");
				} else if (fame < 300 && fame > 99) {
					System.out.println("You had a well attended burial and many visited you often.");
				} else if (fame > 299) {
					System.out.println("Your legacy will forever echo in time. Hundreds of thousands");
					System.out.println("of people come monthly to see your tombstone.");
				}
				System.exit(0);
			}
			if (answer.contentEquals("4")) {
				System.out.println("---------------------------------");
				System.out.println("HP: " + health);
				System.out.println("Money: " + money);
				System.out.println("Fame: " + fame);
				System.out.println("Weapon: " + weapon + " - Damage per hit: " + weaponDamage);
			}
			if (answer.contentEquals("5")) {
				System.out.println("---------------------------------");
				enemyWeapon = "sword";
				System.out.println("As you started towards him, the guard pulled out his " + enemyWeapon + ".");
				System.out.println("Instead of pulling out a weapon to spar him with, you pulled out a wad of");
				System.out.println("cash. $20 to be precise. Living off minimum wage, the guard eyes lit up.");
				System.out.println();
				System.out.println("You: If you let me through, this 20 can be yours.");
				System.out.println("Guard: You may pass.");
				System.out.println();
				money = money - 20;
				System.out.println("You have $" + money + " left, but you are in the city now.");
				break;
			}
		}
		for (int i = 1; i > 0;) { // THIS IS WHEN YOU ARE IN THE CITY
			System.out.println("---------------------------------");
			if (hoursLeft > 0) {
				System.out.println("The city is quiet. There are " + hoursLeft + " hours left of the day.");
			} else {
				System.out.println("The city is quiet. It is time to go to sleep.");
			}
			System.out.println();
			System.out.println("1. Find a job");
			System.out.println("2. Work a job");
			System.out.println("3. Library");
			System.out.println("4. Shop");
			System.out.println("5. Go to the king");
			System.out.println("6. Work out");
			System.out.println("7. Go to sleep");
			System.out.println("8. Inventory and stats");
			System.out.println("9. Go on a quest");
			System.out.println("---------------------------------");
			answer = scan.nextLine();
			if (answer.contentEquals("1")) {
				for (int j = 1; j > 0;) {
					System.out.println("---------------------------------");
					System.out.println("There are a few jobs available");
					System.out.println();
					System.out.println("(If you work the entire day) You can work 3 times a day, each time lasting 4 hours.");
					System.out.println("Apply for:");
					System.out.println("1. Plumber-$30 a day - req. 30 intelligence and 10 strength");
					System.out.println("2. Electrician-$45 a day - req. 50 intelligence and 5 strength");
					System.out.println("3. Guard-$18 a day - req. 20 strength and a sword");
					System.out.println("4. Go back");
					answer = scan.nextLine();
					if (answer.contentEquals("1")) {
						if (intelligence > 29 && strength > 9) {
							System.out.println("---------------------------------");
							System.out.println("You got the job and left the job as a " + jobName);
							haveJob = true;
							jobName = "plumber";
							jobPay = 10;
							System.out.println();
						} else {
							System.out.println();
							System.out.println("You didn't meet the job requirements.");
							System.out.println();
						}
					}
					if (answer.contentEquals("2")) {
						if (intelligence > 49 && strength > 4) {
							System.out.println("---------------------------------");
							System.out.println("You got the job and left the job as a " + jobName);
							haveJob = true;
							jobPay = 15;
							jobName = "electrician";
							System.out.println();
						} else {
							System.out.println();
							System.out.println("You didn't meet the job requirements.");
							System.out.println();
						}
					}
					if (answer.contentEquals("3")) {
						if (strength > 19 && haveSword == true) {
							System.out.println("---------------------------------");
							System.out.println("You got the job and left the job as a " + jobName);
							jobPay = 6;
							haveJob = true;
							jobName = "guard";
							System.out.println();
						} else {
							System.out.println();
							System.out.println("You didn't meet the job requirements.");
							System.out.println();
						}
					}
					if (answer.contentEquals("4")) {
						answer="0";
						break;
					}
				}
			}
			if (answer.contentEquals("2")) {
				if (haveJob) {
					if (hoursLeft>3) {
					System.out.println("---------------------------------");
					if (jobName.contentEquals("plumber")) {
						System.out.print("Plunging mario's pipes");
					}if(jobName.contentEquals("electrician")){
						System.out.println("Wiring up houses");
					}else {
						System.out.println("Attacking goblins");
					}
					System.out.print(".");
					Thread.sleep(1000);
					Thread.sleep(1000);
					System.out.print(".");
					Thread.sleep(1000);
					Thread.sleep(1000);
					System.out.println(".");
					Thread.sleep(1000);
					Thread.sleep(1000);
					System.out.println("As a " + jobName + ", you receive " + jobPay + " dollars.");
					System.out.println();
					money = money + jobPay;
					System.out.println("You have " + money + " dollars.");
					hoursLeft=hoursLeft-4;
				} else {
					System.out.println();
					System.out.println("You don't have enough time!");
					System.out.println();
				}
			}else {
				System.out.println();
				System.out.println("You don't have a job.");
			}
			}
			if (answer.contentEquals("3")) {
				if (hoursLeft>1) {
				System.out.println("---------------------------------");
				System.out.println("You go to the library.");
				System.out.println();
				System.out.println("Reading books about ");
				System.out.print(".");
				Thread.sleep(1000);
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				Thread.sleep(1000);
				System.out.println("Your intelligence rose by 2.");
				intelligence=intelligence+2;
				hoursLeft=hoursLeft-2;
				System.out.println();
				}else {
					System.out.println();
					System.out.println("You don't have enough time!");
					System.out.println();
				}
			}
			if (answer.contentEquals("6")) {
				if (hoursLeft>1) {
				System.out.println("---------------------------------");
				System.out.println("You go to the gym.");
				System.out.println();
				System.out.println("Doing some crunches");
				System.out.print(".");
				Thread.sleep(1000);
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				Thread.sleep(1000);
				System.out.println("Your strength rose by 2.");
				strength=strength+2;
				hoursLeft=hoursLeft-2;
				System.out.println();
				}else {
					System.out.println();
					System.out.println("You don't have enough time!");
					System.out.println();
				}
			}
		if (answer.contentEquals("7")) {
			if (hoursLeft<7) {
				System.out.println("---------------------------------");
				System.out.println("You slept like a log.");
				hoursLeft=12;
				int healthChange=3;
				health=health+healthChange;
				if(health>maxHealth) {
					int healthChangeChange=health-maxHealth;
					health=maxHealth;
					healthChange=healthChange-healthChangeChange;
				}
				System.out.println();
				System.out.println("You wake up refreshed! You rehealed "+healthChange+" health.");
			}else {
				System.out.println("You aren't sleepy!");
			}
		}
		if (answer.contentEquals("4")) {
			for (int j = 1; j > 0;) {
				System.out.println("---------------------------------");
				System.out.println("You come in to the shop.");
				System.out.println();
				System.out.println("Shopkeeper: Hello! I have an unlimited stock");
				System.out.println("of weapons, potions, and more. Feel free to buy as many as you want!");
				System.out.println();
				System.out.println("1. Reheal potions (regains 10 health) - $10 each");
				System.out.println("2. Maximum health potions (gives 1 more max health) - $20 each");
				System.out.println("3. Sword (5 damage per hit) - $20");
				System.out.println("4. Go back");
				answer=scan.nextLine();
				if (answer.contentEquals("1")) {
					if (money>9) {
						System.out.println();
						System.out.println("You bought a reheal potion!");
						System.out.println();
						healthPotions++;
						money=money-10;
					}else {
						System.out.println();
						System.out.println("You don't have enough money!");
						System.out.println();
					}
				}
				if (answer.contentEquals("2")) {
					if (money>19) {
						System.out.println();
						System.out.println("You bought a maximum health potion!");
						System.out.println();
					maxHealthPotions++;
					money=money-20;
					}else {
						System.out.println();
						System.out.println("You don't have enough money!");
						System.out.println();
					}
				}
				if (answer.contentEquals("4")) {
					break;
				}
				if (answer.contentEquals("3")) {
					if (money>19&&haveSword==false) {
						System.out.println();
						System.out.println("You bought a sword!");
						System.out.println();
						haveSword=true;
						weaponDamage=5;
						weapon="sword";
						money=money-20;
					}
				}
			}
		}
		if (answer.contentEquals("8")) {
			for (int j = 1; j > 0;) {
			System.out.println("---------------------------------");
			System.out.println("HP: " + health+"/"+maxHealth);
			System.out.println("Money: " + money);
			System.out.println("Fame: " + fame);
			System.out.println("Weapon: " + weapon + " - Damage per hit: " + weaponDamage);
			System.out.println("Intelligence: "+intelligence);
			System.out.println("Strength: "+strength);
			System.out.println();
			System.out.println("Usables:");
			System.out.println("1. HP Potions: "+healthPotions);
			System.out.println("2. Max Health Potions: "+maxHealthPotions);
			System.out.println();
			System.out.println("3. Go back");
			System.out.println();
			answer=scan.nextLine();
			if (answer.contentEquals("1")) {
				if (healthPotions>0) {
					System.out.println("---------------------------------");
					health=health+10;
					if (health>maxHealth) {
						health=maxHealth;
					}
					System.out.println("You used a health potion. It reheals 10 HP. ");
					System.out.println("Your health is now "+health+".");
					System.out.println();
					healthPotions=healthPotions-1;
				}else {
					System.out.println();
					System.out.println("You don't have any!");
				}
			}
			if (answer.contentEquals("2")) {
				if (maxHealthPotions>0) {
					System.out.println("---------------------------------");
					maxHealth=maxHealth+1;
					System.out.println("You used a max health potion. It gives you 1 additional max HP. ");
					System.out.println("Your max health is now "+maxHealth+".");
					System.out.println();
					maxHealthPotions=maxHealthPotions-1;
				}else {
					System.out.println();
					System.out.println("You don't have any!");
				}
			}
			if (answer.contentEquals("3")) {
				break;
			}
		}
	}
	if (answer.contentEquals("9")) {
		System.out.println("---------------------------------");
		System.out.println("You went on a quest.");
		randInt = rand.nextInt(3);
		System.out.println();
		if (randInt == 1) {
			System.out.println("You decided to follow the wind.");
			System.out.println("You soon arrived at a desert.");
			System.out.println();
			enemyHealth = 10;
			System.out.println("A camel fiercely defends a small patch of grass.");
			System.out.println("The camel strikes first.");
			for (int j = 1; j > 0;) {
				if (enemyHealth < 1) {
System.out.println();
System.out.println("You won! You get 2 fame and $10.");
fame=fame+2;
money=money+10;
System.out.println();
break;
				}
				System.out.println("The camel deals 5 damage!");
				System.out.println();
				health = health - 5;
				System.out.println("Your HP: " + health);
				System.out.println("Camel HP: "+enemyHealth);
				if (health < 1) {
					System.out.println();
					System.out.println("You died. (ಥʖ̯ಥ)");
					System.out.println("You didn't keep your loot.");
					System.out.println();
					System.out.println("Your fame was " + fame + ".");
					if (fame < 10) {
						System.out.println("You were not remembered. No one came to attend your funeral.");
						System.out.println("Actually, you didn't have a funeral.");
					} else if (fame < 30 && fame > 9) {
						System.out.println("A black cat stood on your grave.");
						System.out.println("No one ever visited your tombstone because rumor said it would mean bad luck.");
					} else if (fame < 100 && fame > 29) {
						System.out.println("You had a funeral and people came now and then to respect you.");
					} else if (fame < 300 && fame > 99) {
						System.out.println("You had a well attended burial and many visited you often.");
					} else if (fame > 299) {
						System.out.println("Your legacy will forever echo in time. Hundreds of thousands");
						System.out.println("of people come monthly to see your tombstone.");
					}
					System.out.println();
					System.out.println("You respawn with half health in the city.");
					if (maxHealth%2==0) {
					health=maxHealth/2;
					}else {
						health=(maxHealth/2)+1;
					}
					break;
				}
				for (int j2 = 1; j2 <0;) {
					System.out.println("---------------------------------");
					System.out.println("You have 4 options:");
					System.out.println();
					System.out.println("1. Attack");
					System.out.println("2. Item");
					System.out.println("3. Scare enemy(-1 attack for enemy)");
					System.out.println("4. Rock Skin(+1 defense for you)");
					answer=scan.nextLine();
					if (answer=="1") {
				System.out.println("You attack the camel, dealing " + weaponDamage + " damage with your " + weapon + ".");
				System.out.println();
				enemyHealth = enemyHealth - weaponDamage;
				System.out.println("Your HP: " + health);
				System.out.println("Camel HP: "+enemyHealth);
				System.out.println();
					}if (answer=="2") {
						System.out.println("---------------------------------");
						System.out.println("HP: "+health);
						System.out.println("Enemy HP: "+enemyHealth); 
						System.out.println();
						System.out.println("1. Health potions: "+healthPotions);
						System.out.println("2. Max health potions: "+maxHealthPotions);
					}
				}
			}
		}
	}
}
}
}
