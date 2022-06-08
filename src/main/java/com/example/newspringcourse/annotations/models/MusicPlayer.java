package com.example.newspringcourse.annotations.models;

import com.example.newspringcourse.annotations.interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
    private Music music;
    private Music music2;

    public MusicPlayer(@Qualifier("classicalMusic") Music music, @Qualifier("remixMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Play: " + music.getSong();
    }

}
