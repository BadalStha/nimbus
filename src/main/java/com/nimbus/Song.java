package com.nimbus;

public class Song {
    String title;
    String artist;
    int duration;
    int bitrate;

    public Song(String title, String artist, int duration, int bitrate) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.bitrate = bitrate;
    }

    public String getFormattedTime() {
        int m = duration / 60;
        int s = duration % 60;
        return String.format("%d:%02d", m, s);
    }
}
