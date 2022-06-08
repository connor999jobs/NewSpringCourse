package com.example.newspringcourse.javaConfig.lesson;


import com.example.newspringcourse.javaConfig.lesson.configuration.SpringConf;
import com.example.newspringcourse.javaConfig.lesson.models.MusicPlayers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);

        MusicPlayers musicPlayers = context.getBean("musicPlayers", MusicPlayers.class);
        System.out.println(musicPlayers.getName());
        System.out.println(musicPlayers.playMusic());
        context.close();
    }
}
