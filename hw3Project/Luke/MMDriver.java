/*
MMDriver.java - 7/11/2019
Luke Smutny
CS1530 - Summer2019 - HW3
Driver file containing main method to test the Facade
*/

public class MMDriver{
        public static void main(String[] args){

            Facade facade = new Facade();
            System.out.println("MP3 functionality test with the Facade:\n-------------------------------");
            facade.playMP3();
            facade.pauseMP3();
            facade.rewindMP3();
            facade.ffMP3();
            facade.stopMP3();

            System.out.println("\n\nThe rest are implemented the same way:\n-------------------------------");
            facade.playWMA();
            facade.pauseWAV();
            facade.stopAVI();
            facade.ffMOV();

            System.out.println("\n\n");
            
            System.out.println("\nAdapter Test\n----------------------\n");
            System.out.println("MP4 test: \n");
            facade.playMP4();
            facade.pauseMP4();
            facade.stopMP4();
            facade.ffMP4();
            facade.rewindMP4();
            
            System.out.println("\nVLC test: \n");
            facade.playVLC();
            facade.pauseVLC();
            facade.ffVLC();
            facade.stopVLC();
            facade.rewindVLC();
        



    }

}
