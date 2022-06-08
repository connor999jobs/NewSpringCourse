package com.example.newspringcourse.annotations.homework.models;


import com.example.newspringcourse.annotations.homework.interfaces.MusicH;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusicH implements MusicH {

    private List<String> rockMusic = new ArrayList<>();
    {
        rockMusic.add("AC/DC - TNT");
        rockMusic.add("Nirvate - Smell like teen spirit");
        rockMusic.add("Saliva - Click Click Boom");
    }

    @Override
    public List<String> getListMusic() {
        return rockMusic;
    }
}
