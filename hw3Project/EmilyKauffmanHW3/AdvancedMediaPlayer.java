/**
 * AdvancedMediaPlayer.java - 7/15/2019
 * Emily Kauffman
 * CS1530 - 1010 - HW3
 * Advanced Media Player interface and the MP4 and VLC classes that implement it
 */
public interface AdvancedMediaPlayer {
	public void play(String filename);
	public void ff();
	public void rewind();
	public void pause();
	public void stop();
}

/**
 * MP4 class
 */
class MP4 implements AdvancedMediaPlayer {

	@Override
	public void play(String audioType) {
		System.out.println("Playing MP4 " + audioType);
	}

	public void ff() {
		System.out.println("Fast-forwarding for MP4");
	}

	public void rewind() {
		System.out.println("Rewinding for MP4");
	}

	public void pause() {
		System.out.println("Pausing for MP4");
	}

	public void stop() {
		System.out.println("Stopping for MP4");
	}
	
}

/**
 * VLC Class
 */
class VLC implements AdvancedMediaPlayer{

	@Override
	public void play(String filename) {
		System.out.println("Playing VLC " + filename);
	}

	public void ff(){
		System.out.println("Fast-forwarding for VLC");
	}

	public void rewind(){
		System.out.println("Rewinding for VLC");
	}

	public void pause(){
		System.out.println("Pausing for VLC");
	}

	public void stop(){
		System.out.println("Stopping for VLC");
	}
}