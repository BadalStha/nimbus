package com.nimbus;

public class LocalSong extends Song implements Playable{
    private String filePath;

    public LocalSong(String title, String artist, int duration, int bitrate, String filePath) {
        super(title, artist, duration, bitrate);
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public void play() {
        System.out.println("Reading file from: " + filePath + " and starting playback.");
    }
}
