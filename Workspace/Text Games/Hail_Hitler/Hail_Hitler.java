package Hail_Hitler;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.*;


public class Hail_Hitler {

	
	// IN MENU
	/*
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		boolean i = true;
		while( i = true){
		main();
		}
	}

	//GAME
	*/
	public static void main() throws Exception{
		Player p = new Player();
		Scanner input = new Scanner (System.in) ;
		String Choice;
		String Game;
		Game = "Hail Hitler";

		System.out.println("Fetching class.");
		System.out.println("Your Inventory consists of:");
		p.addItemToInv("Thompson");
		p.addItemToInv("30 round Mags");
		p.addItemToInv("Bacon");
		p.printInv();


	/*	//Variables
		Scanner input = new Scanner(System.in);
		String Choice ;
		String Game ;
		String Inv ;
*/
		//Game


		System.out.println("\b \033 WARNING:Do not for any reason type before the text finishes when it gives you a choice make shure you type your answer correctly and only once or the game will break  \033 \n");
		try {

			Thread.sleep(600);

		}

		catch (InterruptedException ex)

		{



		}

		System.out.println("Game creators");
		try {

			Thread.sleep(1200);

		}

		catch (InterruptedException ex)

		{



		}
		System.out.println("Chris Blanco & Nathan Falk\n");
		try {

			Thread.sleep(1200);

		}

		catch (InterruptedException ex)

		{


		}
		System.out.println("Hail Hitler \n");
		try {

			Thread.sleep(1200);

		}

		catch (InterruptedException ex)

		{


		}
		System.out.println("You are in Berlin Germany");
		try {

			Thread.sleep(1200);

		}

		catch (InterruptedException ex)

		{



		}

		//System.out.println("In Berlin");
		//try {

		//Thread.sleep(1200);

		//}

		//catch (InterruptedException ex)

		//{



		//}
		System.out.println("1945");
		try {
			Thread.sleep(1200);

		}

		catch (InterruptedException ex)

		{



		}
		System.out.println("The Germans Deploy Advanced Technology");
		try {

			Thread.sleep(1200);

		}

		catch (InterruptedException ex)

		{



		}
		// Start of game
		System.out.println("You Arrive on the border in the last transport long after the others to sneek into the city but you are still a long ways away.: You can go left or right");
		Choice = input.next();
		if (Choice.equalsIgnoreCase("Left")){
			System.out.println("There is a crater here that has turned the once beautiful sand to glass that is so slippery it became the germans new welcoming mat.");
			Choice = input.next();
		}
		if (Choice.equalsIgnoreCase("Examine")){
			System.out.println("Welcome Zork!");
			Choice = input.next();
		}

		if (Choice.equalsIgnoreCase("Right")){
			System.out.println("You come to a hill there is a path leading up the hill to an abandoned mortar pit and further to a city: Mortar or City?");
			Choice = input.next();

			if (Choice.equalsIgnoreCase("City")){
				System.out.println("The path is blocked by a bunch of bulls you cannot pass right now");
				Choice = input.next();
			}


			//Mortar Pit		
			if (Choice.equalsIgnoreCase("Mortar")){
				System.out.println("The inside is filthy and covered in soot. The ceiling opens to the blue sky above.");
				try {

					Thread.sleep(500);

				}

				catch (InterruptedException ex)

				{



				}
				System.out.println("You hit an empty can with youre foot");
				try {

					Thread.sleep(2000);

				}

				catch (InterruptedException ex)

				{


				}
				System.out.println("A man comes out of the shadows and attacks you with a knife: Shoot or Club");
				Choice = input.next();

				if (Choice.equalsIgnoreCase("club")){
					System.out.println("You missed");
					System.out.println("Game Over");
				}
				if (Choice.equalsIgnoreCase("Shoot")){
					System.out.println("The bullet punctures his heart and he bleeds out.");
					try {

						Thread.sleep(500);

					}

					catch (InterruptedException ex)

					{



					}
					System.out.println("You come to a door built into the floor \n You try to open it but it is locked \n You must find a key \n table or belt");
					Choice = input.next();

					if (Choice.equalsIgnoreCase("Table")){
						System.out.println("You dont find a key but you find instead a paper with a classified stamp which is rather suspicious \n The paper reads: \n We must furthur assure the polulation that the allied advance is only temporary and the land will be taken back. \n The deployament of the wonderwaffes is going smoothly and they will be \n across the controled territory in a matter of days.(You set the paper back down) Would you like to take the paper?");       	
						Choice = input.next();

						if (Choice.equalsIgnoreCase("Yes")){
							p.printInv();
							Choice = input.next();
						}
					}

					if (Choice.equalsIgnoreCase("belt")){
						System.out.println("You find a ring of 8 rusty keys on youre foes belt each with a letter A-H one is bound to open the door you go back to the door and begin to go through them");
						Choice = input.next();
					}
					if (Choice.equalsIgnoreCase("Table")){
						System.out.println("You dont find a key but instead you find a paper with a classified stamp which is rather suspicious \n The paper reads: \n We must furthur assure the population that the allied advance is only temporary and the land will be taken back. \n The deployament of the wonderwaffes is going smoothly and they will be \n across the controled territory in a matter of days.");
						Choice = input.next();
					}
					if (Choice.equalsIgnoreCase("A")){
						System.out.println("The key goes in but does not turn the lock");
						Choice = input.next();
					}
					if (Choice.equalsIgnoreCase("B")){
						System.out.println("The key does not fit");
						Choice = input.next();
					}	
					if (Choice.equalsIgnoreCase("C")){
						System.out.println("The key is to wide to fit");
						Choice = input.next();
					}
					if (Choice.equalsIgnoreCase("D")){
						System.out.println("The key fits but breaks inside the lock \n Game Over");
					}	
					if (Choice.equalsIgnoreCase("E")){
						System.out.println("The key does not fit");
						Choice = input.next();
					}	
					if (Choice.equalsIgnoreCase("F")){
						System.out.println("The key is to old to work with the lock");
						Choice = input.next();
					}		
					if (Choice.equalsIgnoreCase("G")){
						System.out.println("The key turns the lock a little and you try to force it but it breaks \n game over");
					}  		
					if (Choice.equalsIgnoreCase("H")){
						System.out.println("The key opened the lock! \n Inside you find out that the Germans have been testing huge cannons and tanks built like fortresses it will determine the result of the war if they are deployed (You may now go down the path to the city)");
						Choice = input.next();
					}    



					//City house 1
					if (Choice.equalsIgnoreCase("City")){
						System.out.println("You move down the path towards the city");

						System.out.println("30 minutes later: You advance on the path and arrive at the city limits.");
						System.out.println("There are machine gun nests blocking the road but you slip inside a building on the side. You hear gaurds walking upstairs you franticially try someplace to hide.");
						System.out.println("You hide in a cabinet");

						System.out.println("The darkness surounds you");

						try {

							Thread.sleep(1500);

						}

						catch (InterruptedException ex)

						{



						}
						System.out.println("The gaurds approach and your heart quickens untill it's pounding");
						try {

							Thread.sleep(1200);

						}

						catch (InterruptedException ex)

						{



						}
						System.out.println("The footsteps stop");
						try {

							Thread.sleep(4000);

						}

						catch (InterruptedException ex)

						{



						}
						System.out.println("You see shadows runing past the windows through a crack in the cabinet");
						try {

							Thread.sleep(1500);

						}

						catch (InterruptedException ex)

						{



						}
						System.out.println("The door opens and the gaurds exchange words urgently, they leave quickly after they leave you exit your hiding spot: windows or house");    
						Choice = input.next();




						if (Choice.equalsIgnoreCase("windows")){
							System.out.println("You are shot by a patrolman that was passing by");
							System.out.println("Game Over");
						}

					
						//next house
						if (Choice.equalsIgnoreCase("house")){
							System.out.println("You succesfully crossed the street without being noticed you travel several blocks more you are closing in on hitler but see nothing");
							try {

								Thread.sleep(1200);

							}

							catch (InterruptedException ex)

							{



							}
							System.out.println("A tank turns the corner followed by transports");
							try {

								Thread.sleep(1500);

							}

							catch (InterruptedException ex)

							{



							}
							System.out.println("Troops get out of the transports and search the houses");
							try {

								Thread.sleep(1500);

							}

							catch (InterruptedException ex)

							{



							}
							System.out.println("They come out and are in range: Hide or shoot");
							Choice = input.next();






							if (Choice.equalsIgnoreCase("Hide")){
								System.out.println("You are discovered and shot on site \n Game Over");
							}

							if (Choice.equalsIgnoreCase("Shoot")){
								System.out.println("You shoot with precision and accuracy You explode the flamethrower pack a poorly sealed gas container blowing up the convoy");
								try {

									Thread.sleep(1500);

								}

								catch (InterruptedException ex)

								{



								}
								System.out.println("You are pulled into a doorway from behind and the door shuts");
								System.out.println("A man tells you to be quiet");
								try {

									Thread.sleep(800);

								}

								catch (InterruptedException ex)

								{



								}
								System.out.println("After you stop struggling you are let go of");
								try {

									Thread.sleep(2000);

								}

								catch (InterruptedException ex)

								{



								}
								System.out.println("The man who spoke to you a momment ago introduces himself as Private Ryan and");
								try {

									Thread.sleep(2000);

								}

								catch (InterruptedException ex)

								{



								}
								System.out.println("he apoligises for the sudden snatch and grab but he does not want any more attention dwarn on the building");
								try {

									Thread.sleep(2000);

								}

								catch (InterruptedException ex)

								{



								}
								System.out.println("He asks you to meet his crew that are working on a tunnel to Hitlers bunker: Trust Ryan or shoot him?");
								Choice = input.next();
								if (Choice.equalsIgnoreCase("Shoot")){
									System.out.println("Ryan had expected this and he pulls his pistol and shoots first \n Game Over");
								}
								if (Choice.equalsIgnoreCase("Trust")){
									System.out.println("Ryan: says thank you and please follow me");
									try {

										Thread.sleep(2000);

									}

									catch (InterruptedException ex)

									{



									}
									System.out.println("You desend into the basement which is ordinary except for the hole in the wall that leads about 2 kilometers away");
									try {

										Thread.sleep(2000);

									}

									catch (InterruptedException ex)

									{



									}
									System.out.println("You: How did you make the tunnel so fast?");
									try {

										Thread.sleep(1800);

									}

									catch (InterruptedException ex)

									{



									}
									System.out.println("Ryan: We did not start the tunnel, the people who lived here did we just continued it which was almost finished.");
									try {

										Thread.sleep(1800);

									}

									catch (InterruptedException ex)

									{



									}
									System.out.println("Soldier/miner: We have hit the wall of the bunker lets get the dynamite.");
									try {

										Thread.sleep(1800);

									}

									catch (InterruptedException ex)

									{

										System.out.println("Hey new guy set up the  dynamite by crossing the wires good luck. There are 8 wire sets red, black, green, white, yellow, cyan, turqoise and blue. You only need to cross 1 with the black only i forgot the combo good luck");

										p.removeItemFromInv("Thompson");
										p.addItemToInv("Dynamite");
										p.printInv();
										System.out.println("Do you want to cross the wires?");	
										Choice = input.next();

										if (Choice.equalsIgnoreCase("Yes")){
											System.out.println("Go ahead");
											Choice = input.next();
										}
										if (Choice.equalsIgnoreCase("red")){
											System.out.println("nothing happens");
											Choice = input.next();
										}
										if (Choice.equalsIgnoreCase("green")){
											System.out.println("really dude nope");
											Choice = input.next();
										}	
										if (Choice.equalsIgnoreCase("white")){
											System.out.println("We all know those colors dont mix on a bomb ever did you try yellow?");
											Choice = input.next();
										}
										if (Choice.equalsIgnoreCase("black")){
											System.out.println("Your guessing these in order arent you?");
											Choice = input.next();
										}	
										if (Choice.equalsIgnoreCase("yellow")){
											System.out.println(" WTF Booooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooomb ah ha ha ha ha haha ha ha ha! \n Game over");
										Game_Audio.wtfboom();
										}	
										if (Choice.equalsIgnoreCase("cyan")){
											System.out.println("You win!");
											System.out.println("Dim the lights, cue the music, and let it all roll over (You were a spy you and hitler killed youre fake allies lol)\n The end");  		
											Choice = input.next();
										}		
										if (Choice.equalsIgnoreCase("turqoise")){
											System.out.println("yep you didnt get it.");
											Choice = input.next();
										}  		
										if (Choice.equalsIgnoreCase("blue")){
											System.out.println("You win.. not!");
											System.out.println("Hail Hitler");
                                            Choice = input.next();




										}
									}
								}
							}
						}
					}
				}
			}
		}
	}}								