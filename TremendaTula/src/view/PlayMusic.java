package view;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class PlayMusic {

	private Clip clip;
	
	public void playSound(URL url) {
		try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		System.out.println("PLAYING MUSIC");
		} catch(Exception ex) {
		System.out.println("Error with playing sound.");
		ex.printStackTrace();
		}
		
		
	}
	
	public void endSound() {
		clip.stop();
		clip.flush();
		System.out.println("STOPPING MUSIC");
	}
}
