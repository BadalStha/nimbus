package com.nimbus;

import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {

        String appName = "Nimbus";
        int totalSongs = 1;
        double volume = 0.75;
        boolean isPlaying = true;

        System.out.println("Welcome to " + appName);
        System.out.println("Current Volume: " + (volume * 100) + "%");
        System.out.println("Total Songs: " + totalSongs);

        if (isPlaying) {
            System.out.println("Music is currently playing.\n");
        } else {
            System.out.println("Music is paused.\n");
        }


        Song song1 = new Song("Perfect", "Ed Sheeran", 234, 320);
        Song song2 = new Song("Blinding Lights", "The Weeknd", 200, 320);
        Song song3 = new Song("Badal Sari", "Swar", 510, 320);


        Song[] myPlaylist = {song1, song2, song3};

        for (Song s: myPlaylist) {
            displaySong(s);
        }

    }

    public static void displaySong(Song s) {
        System.out.println("Now Playing: " + s.title + " by " + s.artist);
        System.out.println("Length: " + s.getFormattedTime());
        System.out.println("-----------------------------");
    }
}