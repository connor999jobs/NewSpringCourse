package com.example.newspringcourse.annotations.models;

import com.example.newspringcourse.annotations.interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
//    @Autowired
//    private Music music;
//    private ClassicalMusic classicalMusic;

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }/


    private ClassicalMusic classicalMusic;
    private RemixMusic remixMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RemixMusic remixMusic) {
        this.classicalMusic = classicalMusic;
        this.remixMusic = remixMusic;
    }

//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + remixMusic.getSong());
//
//    }

    public String playMusic() {
        return "Play: " + classicalMusic.getSong();
    }
}
