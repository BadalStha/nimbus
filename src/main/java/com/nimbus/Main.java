package com.nimbus;

public class Main {
    public static void main(String[] args) {

        String appName = "Nimbus";
        int totalSongs = 1;
        double volume = 0.75;
        boolean isPlaying = false;

        System.out.println("Welcome to " + appName);
        System.out.println("Current Volume: " + (volume * 100) + "%");
        System.out.println("Total Songs: " + totalSongs);

        if (isPlaying) {
            System.out.println("Music is currently playing.");
        } else {
            System.out.println("Music is paused.");
        }


        String songTitle = "Perfect";
        String artistName = "Ed Sheeran";
        int durationInSeconds = 234;
        int bitrate = 320;

        int minute =  durationInSeconds / 60 ;
        int seconds = durationInSeconds % 60;


        System.out.println("Now Playing: " + songTitle + " by " + artistName);
        System.out.println("Length: " + minute + ":" + seconds);
        System.out.println("Quality: "+ bitrate + "kbps");
    }
}