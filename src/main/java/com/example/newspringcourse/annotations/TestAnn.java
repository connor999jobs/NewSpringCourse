package com.example.newspringcourse.annotations;

import com.example.newspringcourse.annotations.interfaces.Music;
import com.example.newspringcourse.annotations.models.Computer;
import com.example.newspringcourse.annotations.models.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnn {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        context.close();
    }
}
