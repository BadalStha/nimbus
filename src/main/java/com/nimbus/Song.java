package com.nimbus;

public class Song implements Playable{
    protected String title;
    protected String artist;
    protected int duration;
    protected int bitrate;

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

    @Override
    public void play() {
        System.out.println("Playing generic song...");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }
}
