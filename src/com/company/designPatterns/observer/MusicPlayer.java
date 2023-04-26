package com.company.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private boolean playing;
    private List<String> playlist = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(playing);
        }
    }

    public void play() {
        playing = true;
        notifyObservers();
    }

    public void pause() {
        playing = false;
        notifyObservers();
    }

    public void addToPlaylist(String song) {
        playlist.add(song);
    }

    public void removeFromPlaylist(String song) {
        playlist.remove(song);
    }
}
