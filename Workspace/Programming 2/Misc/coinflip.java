package Misc;


import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.JOptionPane;
public class coinflip extends Applet
implements ActionListener
{
	
	//Declaring variables up here makes them global variables, so they can be used in each method.
	
	Image coin;
	Random generator = new Random();
	int rand,h=0,t=0;
	Random random=new Random();
	Font titleFont=new Font("Serif", Font.BOLD,30);
	Font bigFont=new Font("Arial", Font.BOLD,24);
	Button flip;
	Label title,headscount,tailscount;
	public void init(){
		//Set Window Size
		setLayout(null);
		setSize(800, 500);
		//Initialize coin (image) as the file "heads.jpg"
		coin=getImage(getDocumentBase(),"heads.jpg");
		//Initialize the button roll1
		flip=new Button("Flip");
		flip.setBounds(300, 350, 130, 75);
		flip.setFont(bigFont);
		add(flip);
		//Need the action listener for the button to work
		flip.addActionListener(this);
		
		title=new Label("COIN FLIP");
		title.setBounds(300, 5, 180, 50);
		title.setFont(titleFont);
		add(title);
		
		headscount=new Label("0");
		headscount.setBounds(180, 150, 60, 25);
		headscount.setFont(titleFont);
		headscount.setBackground(Color.YELLOW);
		add(headscount);
		
		tailscount=new Label("0");
		tailscount.setBounds(500, 150, 60, 25);
		tailscount.setFont(titleFont);
		tailscount.setBackground(Color.YELLOW);
		add(tailscount);
		//repaint(); will re-set all of the objects, after you change a label, make sure to use this.
		repaint();
	}
	
	//Method to "draw" the image of the dice, which will initially be one.
	
	//Syntax: g.drawImage(imageName, x position, y position, x size, y size, this);
	
	public void paint (Graphics g){
		g.drawImage(coin,315, 100, 150, 150,this);
	}
	
	//Method to test if the user pushed a button.
	
	//Syntax:if(ae.getSource().equals(buttonName)){
			//What happens?
	//}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource().equals(flip)){flipcoin();}
	}
	
	//After pushing the button, go to this method
	public void flipcoin(){
		//Random number between 1 and 2 store in the variable "rand".
		rand=generator.nextInt(2)+1;
		if(rand==1){
			coin=getImage(getDocumentBase(),"heads.jpg");
			h++;
			headscount.setText(String.valueOf(h));
			//Make sure to repaint(); so the new value in the label shows up.
			repaint();
		}
		if(rand==2){
			coin=getImage(getDocumentBase(),"tails.png");
			t++;
			tailscount.setText(String.valueOf(t));
			repaint();
		}
	}
	}
