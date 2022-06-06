package com.example.newspringcourse.di;

import com.example.newspringcourse.di.models.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
