



import java.util.Scanner;
import java.util.Random;

import Hail_Hitler.Game_Audio;

public class Battleship {

	private Scanner in;
	private boardPiece[][] pboard = {{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()}};

	private boardPiece[][] eboard = {{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()},
			{new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece(),new boardPiece()}};

	private char turn = 'X';
	private boolean win = false;
	private int count = 0;
	//private int mode = 2;
	private Random generator = new Random(System.currentTimeMillis());
	private ship sub = new ship(1);
	private ship destroyer = new ship(2);
	private ship battleship = new ship(3);
	private ship esub = new ship(1);
	private ship edestroyer = new ship(2);
	private ship ebattleship = new ship(3);
	private AIplay AI = new AIplay();

	public static void main(String [] args) throws Exception{
		String again;
		Battleship game = new Battleship();
		game.in = new Scanner(System.in);
		/*System.out.println("Select your mode:");
			System.out.println("1 = Single Player");
			System.out.println("2 = Two Player");
			game.mode = game.in.nextInt();*/
		game.play();

		System.out.println("Would you like to play again?(Y/N): ");
		again = game.in.nextLine();
		while(again.charAt(0) == 'Y'){
			game.init();
			game.play();
			System.out.println("Would you like to play again?(Y/N): ");
			again = game.in.nextLine();
		}
		game.in.close();
		System.out.println("Good Bye!");
		Text_Game_Menu.main(args);
	}

	public void play() throws Exception{
		printBoard();
		place();
		AIplace();
		System.out.println("Enter your geusses in the form 'C4'");
		while(!win)
			move();
	}

	public void printBoard(){
		System.out.println("           ENEMY                         PLAYER");
		System.out.println("   1   2   3   4   5   6          1   2   3   4   5   6");
		for(int x=0; x<6; x++){
			System.out.print((char)(65+x) + " ");
			for(int y=0; y<6; y++){
				System.out.print(eboard[x][y].piece);
			}
			System.out.print("     ");
			System.out.print((char)(65+x) + " ");
			for(int z=0; z<6; z++){
				System.out.print(pboard[x][z].piece);
			}
			System.out.println();
		}
	}

	public void place(){
		System.out.println();
		System.out.println("Place your ships on the board");
		System.out.println("You have 3 ships:  1: 2-spot Submarine, 2: 3-spot Destroyer, 3: 4-spot Battleship");
		System.out.println("First, select the number of the ship. " +
				"Then select the first place where you want the ship to be placed, like 'C4'.");
		System.out.println("Then select the orientation, H=horizontal, V=vertical");
		System.out.println("For example, '2 B5 V', then press enter");
		System.out.println("When you are done, enter 'S' to start.");
		System.out.println("Must use CAPITAL LETTERS");
		String input = "";
		boolean start = false;

		while(!start){
			input = in.nextLine();

			if(input.length() == 1){
				if(input.charAt(0) == 'S'){
					if(battleship.placed && destroyer.placed && sub.placed)
						start = true;
					else
						System.out.println("You need to place all of your ships.");
				}
				else{
					System.out.println("Invalid Input. Try Again.");
				}
			}
			else if(input.length() == 6){
				if(((int)input.charAt(0)-48) >= 4){
					System.out.println("Invalid Ship Type. Try Again.");
				}
				else if(((int)input.charAt(2)-65) >= 6){
					System.out.println("Invalid Row. Try Again.");
				}
				else if(((int)input.charAt(3)-48) >= 7){
					System.out.println("Invalid Column. Try Again.");
				}
				else if((int)input.charAt(5) != 72 && (int)input.charAt(5) != 86){
					System.out.println("Invalid Orientation. Try Again.");
				}
				else{   //Valid Input
					if((int)input.charAt(5) == 72 && (((int)input.charAt(0)-48) + 1) > (7 - ((int)input.charAt(3)-48))){
						System.out.println("Invalid Horizontal Placement. Not enough room.");
					}
					else if((int)input.charAt(5) == 86 && (((int)input.charAt(0)-48) + 1) > (7 - ((int)input.charAt(2) - 64))){
						System.out.println("Invalid Vertical Placement. Not enough room.");
					}
					else{ //Valid Placement, except for overlap
						if(((int)input.charAt(0)-48) == 1){
							placeBoard(input.charAt(5), sub, input.substring(2,4));
						}
						else if(((int)input.charAt(0)-48) == 2){
							placeBoard(input.charAt(5), destroyer, input.substring(2,4));
						}
						else{
							placeBoard(input.charAt(5), battleship, input.substring(2,4));
						}
					}
				}
			}
			else{
				System.out.println("Invalid Input. Try Again.");
			}
		}
	}

	public void AIplace(){
		/*eboard[0][0].used = true;
			eboard[0][1].used = true;
			eboard[0][0].type = 1;
			eboard[0][1].type = 1;
			esub.location = "A1";
			esub.orientation = 'H';

			eboard[1][0].used = true;
			eboard[1][1].used = true;
			eboard[1][2].used = true;
			eboard[1][0].type = 2;
			eboard[1][1].type = 2;
			eboard[1][2].type = 2;
			edestroyer.location = "B1";
			edestroyer.orientation = 'H';

			eboard[2][0].used = true;
			eboard[2][1].used = true;
			eboard[2][2].used = true;
			eboard[2][3].used = true;
			eboard[2][0].type = 3;
			eboard[2][1].type = 3;
			eboard[2][2].type = 3;
			eboard[2][3].type = 3;
			ebattleship.location = "C1";
			ebattleship.orientation = 'H';*/
		boolean flag = false;
		for(int x=1;x<4;x++){
			flag = false;
			while(!flag){
				int a = generator.nextInt(2);
				int b = generator.nextInt(6);
				int c = generator.nextInt(6);
				if(a == 0)
					a = 72;
				else
					a = 86;
				b += 65;
				c += 49;

				if(a == 72 && (x + 1) > (7 - (c-48))){
					//no good, try again
				}
				else if(a == 86 && (x + 1) > (7 - (b-64))){
					//no good, try again
				}
				else{ //Valid Placement, except for overlap
					String d = String.valueOf((char)b) + String.valueOf((char)c);
					//System.out.println("AI LOCATION: " + d + " / " + b + " " + c + " / " + a);
					if(x == 1){
						flag = AIplaceBoard((char)a, esub, d); 
					}
					else if(x == 2){
						flag = AIplaceBoard((char)a, edestroyer, d);
					}
					else{
						flag = AIplaceBoard((char)a, ebattleship, d);
					}
				}
			}
		}
	}

	public void placeBoard(char layout, ship current, String locale){

		boolean overlap = false;

		if(layout == 'H'){
			for(int x=((int)locale.charAt(1)-49);x<((int)locale.charAt(1)-49)+(current.type + 1);x++){
				if(pboard[((int)locale.charAt(0)-65)][x].type != current.type &&
						pboard[((int)locale.charAt(0)-65)][x].used == true)
					overlap = true;
			}
		}
		else{  //layout == 'V'
			for(int x=((int)locale.charAt(0)-65);x<((int)locale.charAt(0)-65)+(current.type + 1);x++){
				if(pboard[x][((int)locale.charAt(1)-49)].type != current.type &&
						pboard[x][((int)locale.charAt(1)-49)].used == true)
					overlap = true;
			}
		}
		if(!overlap){ //If ships don't overlap
			if(current.placed){
				if(current.orientation == 'H'){
					for(int x=((int)current.location.charAt(1)-49);x<((int)current.location.charAt(1)-49)+(current.type + 1);x++){
						pboard[((int)current.location.charAt(0)-65)][x].piece = "___|";
						pboard[((int)current.location.charAt(0)-65)][x].used = false;
						pboard[((int)current.location.charAt(0)-65)][x].type = 0;
					}
				}
				else{  //orientation == 'V'
					for(int x=((int)current.location.charAt(0)-65);x<((int)current.location.charAt(0)-65)+(current.type + 1);x++){
						pboard[x][((int)current.location.charAt(1)-49)].piece = "___|";
						pboard[x][((int)current.location.charAt(1)-49)].used = false;
						pboard[x][((int)current.location.charAt(1)-49)].type = 0;
					}
				}
			}
			if(layout == 'H'){
				for(int x=((int)locale.charAt(1)-49);x<((int)locale.charAt(1)-49)+(current.type + 1);x++){
					pboard[((int)locale.charAt(0)-65)][x].piece = "_@_|";
					pboard[((int)locale.charAt(0)-65)][x].used = true;
					pboard[((int)locale.charAt(0)-65)][x].type = current.type;
				}
			}
			else{  //layout == 'V'
				for(int x=((int)locale.charAt(0)-65);x<((int)locale.charAt(0)-65)+(current.type + 1);x++){
					pboard[x][((int)locale.charAt(1)-49)].piece = "_@_|";
					pboard[x][((int)locale.charAt(1)-49)].used = true;
					pboard[x][((int)locale.charAt(1)-49)].type = current.type;
				}
			}
			current.placed = true;
			current.location = locale;
			current.orientation = layout;
			printBoard();
		}
		else
			System.out.println("Invalid Placement. Ships Overlap.");
	}

	public boolean AIplaceBoard(char layout, ship current, String locale){

		boolean overlap = false;

		if(layout == 'H'){
			for(int x=((int)locale.charAt(1)-49);x<((int)locale.charAt(1)-49)+(current.type + 1);x++){
				if(eboard[((int)locale.charAt(0)-65)][x].type != current.type &&
						eboard[((int)locale.charAt(0)-65)][x].used == true)
					overlap = true;
			}
		}
		else{  //layout == 'V'
			for(int x=((int)locale.charAt(0)-65);x<((int)locale.charAt(0)-65)+(current.type + 1);x++){
				if(eboard[x][((int)locale.charAt(1)-49)].type != current.type &&
						eboard[x][((int)locale.charAt(1)-49)].used == true)
					overlap = true;
			}
		}
		if(!overlap){ //If ships don't overlap
			if(layout == 'H'){
				for(int x=((int)locale.charAt(1)-49);x<((int)locale.charAt(1)-49)+(current.type + 1);x++){
					//eboard[((int)locale.charAt(0)-65)][x].piece = "_@_|";
					eboard[((int)locale.charAt(0)-65)][x].used = true;
					eboard[((int)locale.charAt(0)-65)][x].type = current.type;
				}
			}
			else{  //layout == 'V'
				for(int x=((int)locale.charAt(0)-65);x<((int)locale.charAt(0)-65)+(current.type + 1);x++){
					//eboard[x][((int)locale.charAt(1)-49)].piece = "_@_|";
					eboard[x][((int)locale.charAt(1)-49)].used = true;
					eboard[x][((int)locale.charAt(1)-49)].type = current.type;
				}
			}
			current.placed = true;
			current.location = locale;
			current.orientation = layout;
			return true;
		}
		else
			return false;
	}

	public void move() throws Exception{
		String move = "";
		String valid = "";

		if(turn == 'X'){
			System.out.println("Enter move: ");	
			move = in.nextLine();
		}
		else
			move = moveAI();

		valid = checkMove(move);
		while(valid != "ok"){
			if(turn == 'X'){
				System.out.println("ERROR: "+ valid);
				move = in.nextLine();
			}
			else
				move = moveAI(); 
			valid = checkMove(move);
		}

		processMove(move);

		if(turn == 'O')
			printBoard();

		if(count >= 17)
			checkWin();

		if(turn == 'X')
			turn = 'O';
		else
			turn = 'X';
	}

	public String checkMove(String move){

		if(((int)move.charAt(0)-65) >= 6)
			return "Invalid Row. Can only be A-F. Enter another move: ";	
		if(((int)move.charAt(1)-48) >= 7)
			return "Invalid Column. Can only be 1-6. Enter another move: ";
		if(turn == 'X'){
			if(eboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].selected)  
				return "Already chosen. Enter another move: ";
		}
		else{
			if(pboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].selected){
				AI.error = true;
				AI.himi = 'M';
				return "Bad AI, Bad";
			}
		}

		return "ok";
	}

	public void processMove(String move) throws Exception{

		count++;
		char himi = ' ';
		String message = "";

		if(turn == 'X'){
			if(eboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].used){   
				himi = 'X';
				message = "Hit!";
				
			}
			else{
				himi = 'o';
				message = "Miss!";
				
			}
			eboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].piece = "_"+himi+"_|";
			eboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].selected = true;
		}
		else{
			if(pboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].used){   
				himi = 'X';
				message = "Hit!";
				Game_Audio.explosion();
				AI.himi2 = AI.himi;
				AI.himi = 'H';
				AI.count++;
			}
			else{
				himi = 'o';
				message = "Miss!";
				
				AI.himi2 = AI.himi;
				AI.himi = 'M';
				AI.count++;
			}
			pboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].piece = "_"+himi+"_|";
			pboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].selected = true;
		}

		int counter = 0;
		if(himi == 'X'){
			if(turn == 'X'){
				int stype = eboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].type;

				for(int x=0;x<6;x++){
					for(int y=0;y<6;y++){
						if(eboard[x][y].selected && eboard[x][y].type == stype)
							counter++;
					}
				}
				if(counter == (stype + 1)){
					String xship = "";
					if(stype == 1){
						xship = "Submarine!";
						esub.destroyed = true;
					}
					else if(stype == 2){
						xship = "Destroyer!";
						edestroyer.destroyed = true;
					}
					else{
						xship = "Battleship!";
						ebattleship.destroyed = true;
					}
					message += " You destroyed the " + xship;
					
				}
			}
			else{
				int stype = pboard[((int)move.charAt(0)-65)][((int)move.charAt(1)-49)].type;

				for(int x=0;x<6;x++){
					for(int y=0;y<6;y++){
						if(pboard[x][y].selected && pboard[x][y].type == stype)
							counter++;
					}
				}
				if(counter == (stype + 1)){
					String xship = "";
					if(stype == 1){
						xship = "Submarine!";
						sub.destroyed = true;
					}
					else if(stype == 2){
						xship = "Destroyer!";
						destroyer.destroyed = true;
					}
					else{
						xship = "Battleship!";
						battleship.destroyed = true;
					}
					message += " They've destroyed your " + xship;
					
					AI.himi = 'M';  //Make it choose a random # next time, because ship destroyed
					AI.himi2 = 'M';
				}
			}
		}
		if(turn == 'O')
			message = "Enemy " + message;
		System.out.println(message);
	}

	public void checkWin() throws Exception{  
		if(esub.destroyed && edestroyer.destroyed && ebattleship.destroyed){
			win = true;
			System.out.println("Congratulations! You've won!");
			Game_Audio.applause();
		}
		if(sub.destroyed && destroyer.destroyed && battleship.destroyed){
			win = true;
			System.out.println("Defeat! You've lost your fleet!");
			
		}
	}

	public void init(){
		for(int x=0;x<6;x++){
			for(int y=0;y<6;y++){
				eboard[x][y] = new boardPiece();
				pboard[x][y] = new boardPiece();
			}			 
		}
		turn = 'X';
		win = false;
		count = 0;
		sub = new ship(1);
		destroyer = new ship(2);
		battleship = new ship(3);
		esub = new ship(1);
		edestroyer = new ship(2);
		ebattleship = new ship(3);
	}

	public String moveAI(){
		int x = 0;
		int y = 0;

		if(AI.count<1 || (AI.himi == 'M' && AI.himi2 == 'M') || AI.error){
			x = generator.nextInt(6);
			y = generator.nextInt(6);
			x += 65;
			y += 49;
			AI.error = false;
		}
		else if(AI.himi == 'H'){
			x = AI.lasta;
			if(AI.lastb<54)
				y = AI.lastb + 1;
			else
				y = AI.lastb - 1;
		}
		else if(AI.himi2 == 'H' && AI.himi == 'M'){
			if(AI.lasta2<70)
				x = AI.lasta2 + 1;
			else
				x = AI.lasta2 - 1;
			y = AI.lastb2;
		}

		String z = String.valueOf((char)x) + String.valueOf((char)y);

		AI.lasta2 = AI.lasta;
		AI.lastb2 = AI.lastb;
		AI.lasta = x;
		AI.lastb = y;

		return z;
	}

	class boardPiece{
		public String piece;
		public char player;
		public boolean used;
		public boolean selected;
		public int type;

		boardPiece(){
			piece = "___|";
			used = false;
			selected = false;
			type = 0;
		}
	}

	class ship{
		public int type;
		public boolean placed;
		public boolean destroyed;
		public String location;
		public char orientation;

		ship(int x){
			type = x;
			placed = false;
			destroyed = false;
			location = "";
			orientation = ' ';
		}
	}

	class AIplay{
		public int lasta;
		public int lastb;
		public int lasta2;
		public int lastb2;
		public char himi;
		public char himi2;
		public int count;
		public boolean error;

		AIplay(){
			lasta = 0;
			lastb = 0;
			lasta2 = 0;
			lastb2 = 0;
			himi = 'M';
			himi2 = 'M';
			count = 0;
			error = false;
		}
	}
}

