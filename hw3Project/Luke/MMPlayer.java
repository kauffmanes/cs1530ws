/*
MMPlayer.java - 7/11/2019
Luke Smutny
CS1530 - Summer2019 - HW3
File for MMPlayer interface and extended classes
*/

public interface MMPlayer {
    public void play(String fileName);
    public void ff();
    public void rewind();
    public void pause();
    public void stop();
    
}

//concrete classes for media
class MP3 implements MMPlayer{
    public void play(String fileName){
        System.out.println("Playing MP3 Media for " + fileName);
    }

    public void ff(){
        System.out.println("Fast-forwarding for MP3");
    }

    public void rewind(){
        System.out.println("Rewinding for MP3");
    }

    public void pause(){
        System.out.println("Pausing for MP3");
    }

    public void stop(){
        System.out.println("Stopping for MP3");
    }
}



class WAV implements MMPlayer{
    public void play(String fileName){
        System.out.println("Playing WAV Media for " + fileName);
    }

    public void ff(){
        System.out.println("Fast-forwarding for WAV");
    }

    public void rewind(){
        System.out.println("Rewinding for WAV");
    }

    public void pause(){
        System.out.println("Pausing for WAV");
    }

    public void stop(){
        System.out.println("Stopping for WAV");
    }
}



class WMA implements MMPlayer{
    public void play(String fileName){
        System.out.println("Playing WMA Media for " + fileName);
    }

    public void ff(){
        System.out.println("Fast-forwarding for WMA");
    }

    public void rewind(){
        System.out.println("Rewinding for WMA");
    }

    public void pause(){
        System.out.println("Pausing for WMA");
    }

    public void stop(){
        System.out.println("Stopping for WMA");
    }
}



class AVI implements MMPlayer{
    public void play(String fileName){
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


class MOV implements MMPlayer{
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



