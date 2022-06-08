package com.example.newspringcourse.javaConfig.homework;

import com.example.newspringcourse.javaConfig.homework.config.NewSpringConfig;
import com.example.newspringcourse.javaConfig.homework.models.NewMusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestHomeworkTask {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                NewSpringConfig.class
        );

        NewMusicPlayer newMusicPlayer = context.getBean("newMusicPlayer", NewMusicPlayer.class);
        System.out.println(newMusicPlayer.playMusic());

        context.close();
    }
}
