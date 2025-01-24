package _01_OCP;

public class SoundPlayer {
	
	private PlayInterface playInter;
	
	void setPlayInter(PlayInterface playInter) {
		this.playInter=playInter;
	}
	
	void Play() {
		playInter.Player();
	}
	
}
