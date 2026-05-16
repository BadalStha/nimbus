package com.nimbus;

public class LocalSong extends Song implements Playable{
    private String filePath;

    public LocalSong(String title, String artist, int duration, int bitrate, String filePath) {
        super(title, artist, duration, bitrate);
        this.filePath = filePath;
    }

    public LocalSong() {}

    public String getFilePath() {
        return filePath;
    }

    @Override
    public void play() {
        if (filePath == null || filePath.isEmpty()) {
            throw new RuntimeException("File path is missing!");
        }
        System.out.println("Reading file from: " + filePath + " and starting playback.");
    }
}
