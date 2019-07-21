/**
 * MMPlayer.java - 7/15/2019
 * Emily Kauffman
 * CS1530 -1010 - HW3
 * MMPlayer interface and extended classes
 */

/**
 * MMPlayer Interface
 */
public interface MMPlayer {
	
	public void play(String fileName);
	
	public void ff();
	
	public void rewind();
	
	public void pause();
	
	public void stop();

}

/**
 * MP3 Class
 */
class MP3 implements MMPlayer {
	
	public void play(String fileName) {
		System.out.println("Playing MP3 Media for " + fileName + ".");
	}

	public void ff() {
		System.out.println("Fast-forwarding for MP3.");
	}

	public void rewind() {
		System.out.println("Rewinding for MP3.");
	}

	public void pause() {
		System.out.println("Pausing for MP3.");
	}
	
	public void stop() {
		System.out.println("Stopping for MP3.");
	}
}


/**
 * WAV Concrete Class
 */
class WAV implements MMPlayer {

	public void play(String fileName) {
			System.out.println("Playing WAV Media for " + fileName + ".");
	}

	public void ff() {
			System.out.println("Fast-forwarding for WAV.");
	}

	public void rewind() {
			System.out.println("Rewinding for WAV.");
	}

	public void pause() {
			System.out.println("Pausing for WAV.");
	}

	public void stop() {
			System.out.println("Stopping for WAV.");
	}
}

/**
 * WMA Concrete Class
 */
class WMA implements MMPlayer {

	public void play(String fileName){
			System.out.println("Playing WMA Media for " + fileName + ".");
	}

	public void ff(){
			System.out.println("Fast-forwarding for WMA.");
	}

	public void rewind(){
			System.out.println("Rewinding for WMA.");
	}

	public void pause(){
			System.out.println("Pausing for WMA.");
	}

	public void stop(){
			System.out.println("Stopping for WMA.");
	}
}

/**
 * AVI Concrete Class
 */
class AVI implements MMPlayer {

	public void play(String fileName) {
			System.out.println("Playing AVI Media for " + fileName);
	}

	public void ff(){
			System.out.println("Fast-forwarding for AVI");
	}

	public void rewind(){
			System.out.println("Rewinding for AVI");
	}

	public void pause(){
			System.out.println("Pausing for AVI");
	}

	public void stop(){
			System.out.println("Stopping for AVI");
	}
}

/**
 * MOV Concrete Class
 */
class MOV implements MMPlayer {

	public void play(String fileName){
			System.out.println("Playing MOV Media for " + fileName);
	}

	public void ff(){
			System.out.println("Fast-forwarding for MOV");
	}

	public void rewind(){
			System.out.println("Rewinding for MOV");
	}

	public void pause(){
			System.out.println("Pausing for MOV");
	}

	public void stop(){
			System.out.println("Stopping for MOV");
	}
}
