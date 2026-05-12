package com.nimbus;

public class CloudSong extends Song implements Playable{
    private String streamUrl;

    public CloudSong(String title, String artist, int duration, int bitrate, String streamUrl) {
        super(title, artist, duration, bitrate);
        this.streamUrl = streamUrl;
    }

    public String getStreamUrl() {
        return streamUrl;
    }

    @Override
    public void play() {
        System.out.println("Connecting to " + streamUrl + " and buffering stream...");
    }
}
