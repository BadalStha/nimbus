package com.nimbus;

import java.util.List;
import java.util.stream.StreamSupport;
import java.util.ArrayList;

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

        // Initializing the dynamic list
        ArrayList<Song> nimbusPlaylist = new ArrayList<>();

        // Adding songs dynamically
        nimbusPlaylist.add(new Song("Perfect", "Ed Sheeran", 234, 320));
        nimbusPlaylist.add(new Song("Blinding Lights", "The Weeknd", 200, 320));
        nimbusPlaylist.add(new Song("Badal Sari", "Swar", 510, 320));
        nimbusPlaylist.add(new Song("Stay", "Justin Biber", 141, 320));

        nimbusPlaylist.remove(1);

        Song song1 = new Song ("Highway to Hell", "AC/DC", 328, 320);

        nimbusPlaylist.add(0, song1);

        // Loop to display music
        for (Song s: nimbusPlaylist) {
            displaySong(s);
        }

        System.out.println("Total Songs in Library: " + nimbusPlaylist.size());

    }

    public static void displaySong(Song s) {
        System.out.println("Now Playing: " + s.title + " by " + s.artist);
        System.out.println("Length: " + s.getFormattedTime());
        System.out.println("-----------------------------");
    }
}