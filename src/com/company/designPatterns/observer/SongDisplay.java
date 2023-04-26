package com.company.designPatterns.observer;

public class SongDisplay implements Observer {
    private boolean playing;
    private String currentSong;

    @Override
    public void update(boolean playing) {
        this.playing = playing;
        if (playing) {
            System.out.println("Şu an çalan şarkı: " + currentSong);
        } else {
            System.out.println("Müzik durduruldu.");
        }
    }

    public void setCurrentSong(String song) {
        this.currentSong = song;
    }
}
