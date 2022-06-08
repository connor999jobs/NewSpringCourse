package com.example.newspringcourse.annotations.homework.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayerH {
    private ClassicalMusicH classicalMusicH;
    private RockMusicH rockMusicH;


    @Autowired
    public MusicPlayerH(ClassicalMusicH classicalMusicH, RockMusicH rockMusicH) {
        this.classicalMusicH = classicalMusicH;
        this.rockMusicH = rockMusicH;
    }

    public void playMusic(Gerne gerne){
        Random random = new Random();
        int randomN = random.nextInt(3);

        if (gerne == Gerne.CLASSICAL){
            System.out.println(classicalMusicH.getListMusic().get(randomN));
        } else {
            System.out.println(rockMusicH.getListMusic().get(randomN));
        }
    }
}
