package com.example.newspringcourse.annotations.homework;

import com.example.newspringcourse.annotations.homework.models.Gerne;
import com.example.newspringcourse.annotations.homework.models.MusicPlayerH;
import com.example.newspringcourse.annotations.interfaces.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHomework {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        MusicPlayerH musicPlayerH = context.getBean("musicPlayerH", MusicPlayerH.class);

        musicPlayerH.playMusic(Gerne.CLASSICAL);
        musicPlayerH.playMusic(Gerne.ROCK);

        context.close();
    }
}
