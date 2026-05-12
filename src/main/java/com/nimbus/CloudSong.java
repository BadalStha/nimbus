package com.nimbus;

public class CloudSong extends Song{
    private String streamUrl;

    public CloudSong(String title, String artist, int duration, int bitrate, String streamUrl) {
        super(title, artist, duration, bitrate);
        this.streamUrl = streamUrl;
    }

    public String getStreamUrl() {
        return streamUrl;
    }
}
