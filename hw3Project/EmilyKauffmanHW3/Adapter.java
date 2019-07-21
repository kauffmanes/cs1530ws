/**
 * Adapter.java - 7/15/2019
 * Emily Kauffman
 * CS1530 - 1010 - HW3
 * Adapter class that adapts the MP4 and VLC classes to play through Facade
 */
class Adapter implements MMPlayer {

	AdvancedMediaPlayer advancedPlayer;

	public Adapter (String audioType) {
		
		if (audioType.equalsIgnoreCase("mp4")) {
			advancedPlayer = new MP4();
		} else if (audioType.equalsIgnoreCase("vlc")) {
			advancedPlayer = new VLC();
		}
	}

	@Override
	public void play(String fileName) {
		advancedPlayer.play(fileName);
	}

	@Override
	public void stop(){
		advancedPlayer.stop();
	}

	@Override
	public void pause(){
		advancedPlayer.pause();
	}

	@Override
	public void ff(){
		advancedPlayer.ff();
	}

	@Override
	public void rewind(){
		advancedPlayer.rewind();
	}
}
