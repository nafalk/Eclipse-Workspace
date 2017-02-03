package Misc;
import java.io.File;
//import java.net.URL;
 
import javax.sound.sampled.*;
 
public class audio {
 
	 
	    public static void main(String[] args) throws Exception {
	    	
	        /* If using an audio file copied to your program */
	        File file = new File ("Sounds/insert audio name here.wav"); // "Sounds" is the folder 
	        AudioInputStream ais = AudioSystem.getAudioInputStream( file );
	    		
	       
	        Clip clip = AudioSystem.getClip();
	        clip.open(ais);
	        clip.start();
	        Thread.sleep(clip.getMicrosecondLength()/1000);
	        
	        /* If using an audio file from a website */
	         //URL url = new URL("http://www.villagegeek.com/html/wavfiles1.htm");
	        // AudioInputStream ais = AudioSystem.getAudioInputStream( url );
	 
	    }
	}
