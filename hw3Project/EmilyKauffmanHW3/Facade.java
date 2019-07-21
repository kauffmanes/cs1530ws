/**
 * Facade.java - 7/15/2019
 * Emily Kauffman
 * CS1530-1010
 * Summer 2019 - HW3
 * File Facade class that brings all the objects
 * and methods together to be easily accessed
 */

 public class Facade {

	// regular media player
	public MMPlayer mp3;
	public MMPlayer wav;
	public MMPlayer wma;
	public MMPlayer avi;
	public MMPlayer mov;

	// advanced media players
	public MMPlayer mp4;
	public MMPlayer vlc;

	// constructor
	public Facade() {
		mp3 = new MP3();
		wav = new WAV();
		wma = new WMA();
		avi = new AVI();
		mov = new MOV();
		mp4 = new Adapter("mp4");
		vlc = new Adapter("vlc");
	}

	// MP4 facade actions
	public void playMP4() {
		mp4.play("mp4");
	}

	public void ffMP4() {
		mp4.ff();
	}

	public void rewindMP4() {
		mp4.rewind();
	}

	public void stopMP4() {
		mp4.stop();
	}

	public void pauseMP4() {
		mp4.pause();
	}


	// VLC facade actions
	public void playVLC() {
		vlc.play("vlc");
	}

	public void ffVLC() {
		vlc.ff();
	}

	public void rewindVLC() {
		vlc.rewind();
	}

	public void stopVLC() {
		vlc.stop();
	}

	public void pauseVLC() {
		vlc.pause();
	}


	//facade actions for mp3
	public void playMP3() {
		mp3.play("A New Song");
	}

	public void ffMP3() {
		mp3.ff();
	}

	public void rewindMP3() {
		mp3.rewind();
	}

	public void pauseMP3() {
		mp3.pause();
	}

	public void stopMP3() {
		mp3.stop();
	}


	//facade actions for WAV
	public void playWAV() {
		wav.play("A New Song");
	}

	public void ffWAV() {
		wav.ff();
	}
	
	public void rewindWAV() {
		wav.rewind();
	}
	public void pauseWAV() {
		wav.pause();
	}

	public void stopWAV() {
		wav.stop();
	}


	//facade actions for wma
	public void playWMA() {
		wma.play("A New Song");
	}
	public void ffWMA(){
		wma.ff();
	}
	public void rewindWMA(){
		wma.rewind();
	}
	public void pauseWMA(){
		wma.pause();
	}
	public void stopWMA(){
		wma.stop();
	}



	//facade actions for avi
	public void playAVI() {
		avi.play("A New Song");
	}

	public void ffAVI() {
		avi.ff();
	}

	public void rewindAVI() {
		avi.rewind();
	}

	public void pauseAVI() {
		avi.pause();
	}

	public void stopAVI() {
		avi.stop();
	}


	//facade actions for mov
	public void playMOV() {
		mov.play("A New Song");
	}

	public void ffMOV() {
		mov.ff();
	}

	public void rewindMOV() {
		mov.rewind();
	}

	public void pauseMOV() {
		mov.pause();
	}

	public void stopMOV() {
		mov.stop();
	}
	
}