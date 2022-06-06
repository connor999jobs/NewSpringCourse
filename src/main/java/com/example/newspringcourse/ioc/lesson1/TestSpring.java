package com.example.newspringcourse.ioc.lesson1;

import com.example.newspringcourse.ioc.lesson1.interfaces.Music;
import com.example.newspringcourse.ioc.lesson1.models.MusicPlayer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music classicalBean = context.getBean("musicBean", Music.class);
//        Music rockBean = context.getBean("musicRockBean", Music.class);
//        Music remixBean = context.getBean("musicRemixBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(classicalBean);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer1 = new MusicPlayer(rockBean);
//        musicPlayer1.playMusic();
//
//        MusicPlayer musicPlayer2 = new MusicPlayer(remixBean);
//        musicPlayer2.playMusic();

//        context.close();
    }
}
