package com.example.newspringcourse.javaConfig.lesson.models;

import com.example.newspringcourse.javaConfig.lesson.interfaces.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("musicPlayers")
public class MusicPlayers {
    @Autowired
    @Qualifier("classicalMusics")
    private Music music1;
    @Autowired
    @Qualifier("rockMusics")
    private Music music2;
    @Autowired
    @Qualifier("remixMusics")
    private Music music3;

    @Value("${musicPlayer.name}")
    public String name;

    @Value("${musicPlayer.volume}")
    public int volume;



    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayers(@Qualifier("classicalMusics") Music music1, @Qualifier("rockMusics") Music music2,
                        @Qualifier("remixMusics") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(){
        return "Play: " + music1.getSong() + "\n\"" + music2.getSong() + "\n\""  + music3.getSong();
    }

}
