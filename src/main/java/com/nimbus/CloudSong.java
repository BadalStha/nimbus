package com.nimbus;

public class CloudSong extends Song implements Playable{
    private String streamUrl;

    public CloudSong(String title, String artist, int duration, int bitrate, String streamUrl) {
        super(title, artist, duration, bitrate);
        this.streamUrl = streamUrl;
    }

    public CloudSong() {}

    public String getStreamUrl() {
        return streamUrl;
    }

    @Override
    public void play() {
        if (streamUrl == null || streamUrl.isEmpty()) {
            throw new RuntimeException("Link is missing" + streamUrl);
        }
        System.out.println("Connecting to " + streamUrl + " and buffering stream...");
    }
}
