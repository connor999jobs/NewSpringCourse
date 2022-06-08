package com.example.newspringcourse.annotations;

import com.example.newspringcourse.annotations.interfaces.Music;
import com.example.newspringcourse.annotations.models.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnn {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Music music = context.getBean("remixMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}
