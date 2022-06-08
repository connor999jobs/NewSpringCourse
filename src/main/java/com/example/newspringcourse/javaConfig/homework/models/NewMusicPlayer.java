package com.example.newspringcourse.javaConfig.homework.models;

import com.example.newspringcourse.annotations.interfaces.Music;
import com.example.newspringcourse.javaConfig.homework.interfacess.NewMusic;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class NewMusicPlayer {
    @Value("${musicPlayer.name}")
    public String name;

    @Value("${musicPlayer.volume}")
    public int volume;

    private List<NewMusic> musicList;

    public NewMusicPlayer(List<NewMusic> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic(){
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getMusic() + "with volume " + this.volume;
    }
}
