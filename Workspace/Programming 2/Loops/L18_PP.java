package Loops;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class L18_PP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Random randNum = new Random();
		Scanner input = new Scanner (System.in) ;
		Scanner input1 = new Scanner (System.in);

		int counter=1,counter2=0,average,pickedNum,tg=0;
		String yaOrNa="";

		int randomNumber = randNum.nextInt(100) + 1;


		//loop
		while (!yaOrNa.equalsIgnoreCase ("n") ){			
			

			// Ask user to guess the random number
			System.out.println("\nrandomNum =" + randomNumber);
			System.out.println("\nGuess a number between 1 and 100:");
			pickedNum = input.nextInt();

			if(pickedNum > randomNumber ){
				System.out.println("Too high.");
				counter ++;
			}
			else if (pickedNum < randomNumber){
				System.out.println("Too low.");
				counter ++;
			}

			else if (pickedNum == randomNumber){
				yaOrNa.equalsIgnoreCase("Y");
				counter2 ++;
				System.out.printf ("Your correct! \nIt took you %d geusses\n_______________________________________________", counter);
				 
				
				File file = new File ("Sounds/applause.wav"); 
			        AudioInputStream ais = AudioSystem.getAudioInputStream( file );
			    	
			        Clip clip = AudioSystem.getClip();
			        clip.open(ais);
			        clip.start();
			        Thread.sleep(clip.getMicrosecondLength()/1000);	

				System.out.print ("\n\nWould you like to play again (y or n): ");
				yaOrNa = input1.nextLine();
			}
			if (yaOrNa.equalsIgnoreCase ("Y")){
			tg=counter;	
			counter = 1;
			randomNumber = randNum.nextInt(100) + 1;
				
			}

			else if (yaOrNa.equalsIgnoreCase("N")){
				average =tg / counter2;
				System.out.printf("Thanks for playing.\nYou played %d games.\nYou geussed %d times.\nYou averaged %d geusses",counter2,counter,average);

			}
			

		}


      
      

	}
}
        
    
	
