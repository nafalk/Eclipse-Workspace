package Hail_Hitler;

import java.io.File;

import javax.sound.sampled.*;
 
public class Game_Audio {
 
	 
	    /*public static void main(String[] args) throws Exception{
	    wtfboom();
	    }
	   */
	// WTF Boom
	    public static void wtfboom() throws Exception{
	        File file = new File ("Sounds/wtf_boom.wav"); 
	        AudioInputStream ais = AudioSystem.getAudioInputStream( file );
	    		
	        Clip clip = AudioSystem.getClip();
	        clip.open(ais);
	        clip.start();
	        Thread.sleep(clip.getMicrosecondLength()/1000);
	        
	    }
	    
	 // explosion
	    public static void explosion() throws Exception{
	        File file = new File ("Sounds/explosion.wav"); 
	        AudioInputStream ais = AudioSystem.getAudioInputStream( file );
	    		
	        Clip clip = AudioSystem.getClip();
	        clip.open(ais);
	        clip.start();
	        Thread.sleep(clip.getMicrosecondLength()/1000);
	        
	    }
	    
	 //  applause
	    public static void applause() throws Exception{
	        File file = new File ("Sounds/applause.wav"); 
	        AudioInputStream ais = AudioSystem.getAudioInputStream( file );
	    		
	        Clip clip = AudioSystem.getClip();
	        clip.open(ais);
	        clip.start();
	        Thread.sleep(clip.getMicrosecondLength()/1000);
	    }
	}
