package com.example.newspringcourse.di.models;

import com.example.newspringcourse.di.interfaces.Music;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
