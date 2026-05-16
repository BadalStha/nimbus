//package com.nimbus;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.StreamSupport;
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//
//        String appName = "Nimbus";
//        int totalSongs = 1;
//        double volume = 0.75;
//        boolean isPlaying = true;
//
//        System.out.println("Welcome to " + appName);
//        System.out.println("Current Volume: " + (volume * 100) + "%");
//        System.out.println("Total Songs: " + totalSongs);
//
//        if (isPlaying) {
//            System.out.println("Music is currently playing.\n");
//        } else {
//            System.out.println("Music is paused.\n");
//        }
//
//        // Initializing the dynamic list
//        ArrayList<Song> nimbusPlaylist = new ArrayList<>();
//        ArrayList<Song> emptyPlayList = new ArrayList<>();
//
//        // Adding songs dynamically
//        nimbusPlaylist.add(new Song("Perfect", "Ed Sheeran", 234, 320));
//        nimbusPlaylist.add(new Song("Blinding Lights", "The Weeknd", 200, 320));
//        nimbusPlaylist.add(new Song("Badal Sari", "Swar", 510, 320));
//        nimbusPlaylist.add(new Song("Stay", "Justin Biber", 141, 320));
//
//        nimbusPlaylist.remove(1);
//
//        Song song1 = new Song ("Highway to Hell", "AC/DC", 328, 320);
//
//
//        LocalSong song2 = new LocalSong("Timi Bhane", "Albatross", 503, 320,"/home/badal/Music/timibhane.mp3");
//        LocalSong song4 = new LocalSong("Laijane Ho Ki", "Yankee Yolmo", 316, 320, "/home/badal/Music/Laijanehoki.mp3");
//        CloudSong song3 = new CloudSong("Tum Tak", "Javed Ali", 505, 320, "examplelinktomucic.com");
//
//        nimbusPlaylist.add(0, song1);
//        nimbusPlaylist.add(song2);
//        nimbusPlaylist.add(song3);
//        nimbusPlaylist.add(song4);
//
//        try {
//            emptyPlayList.get(0);
//        } catch (Exception e) {
//            System.out.println("Your library is currently empty. Add some music!");
//        }
//
//        // Loop to display music
//        for (Song s: nimbusPlaylist) {
//
//            try {
//                s.play();
//                displaySong(s);
//            } catch (Exception e) {
//                System.out.println("Could not play " + s.title + ": " + e.getMessage());
//            }
//        }
//
//        System.out.println("Total Songs in Library: " + nimbusPlaylist.size());
//
//        // Search song with artist
//        System.out.println("\n---Searching for 'Swar' ---");
//
//        List<Song> searchResults = nimbusPlaylist.stream()
//                .filter(s -> s.artist.equalsIgnoreCase("Swar"))
//                .collect(Collectors.toList());
//
//        searchResults.forEach(s -> System.out.println("Found: " + s.title));
//
//        // Search song with duration
//        System.out.println("\n--- Searching for duration ---");
//        List<Song> durationResults = nimbusPlaylist.stream()
//                .filter(s -> s.duration > 300)
//                .collect(Collectors.toList());
//
//        durationResults.forEach(s -> System.out.println("Found: " + s.title));
//
//        // Find total local song
//        long totalLocal = nimbusPlaylist.stream()
//                .filter(s -> s instanceof LocalSong).count();
//
//        System.out.println("Total Local Songs: " + totalLocal);
//
//
//    }
//
//    public static void displaySong(Song s) {
//        System.out.println("Now Playing: " + s.title + " by " + s.artist);
//        System.out.println("Length: " + s.getFormattedTime());
//        System.out.println("-----------------------------");
//    }
//}