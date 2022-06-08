package com.example.newspringcourse.javaConfig.lesson.configuration;

import com.example.newspringcourse.javaConfig.lesson.models.ClassicalMusics;
import com.example.newspringcourse.javaConfig.lesson.models.MusicPlayers;
import com.example.newspringcourse.javaConfig.lesson.models.RemixMusics;
import com.example.newspringcourse.javaConfig.lesson.models.RockMusics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.newspringcourse.javaConfig.lesson")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConf {
    @Bean
    public ClassicalMusics classicalMusics(){
        return new ClassicalMusics();
    }

    @Bean
    public RemixMusics remixMusics(){
        return new RemixMusics();
    }

    @Bean
    public RockMusics rockMusics(){
        return new RockMusics();
    }

    @Bean
    public MusicPlayers musicPlayers(){
        return new MusicPlayers(classicalMusics(), remixMusics(), rockMusics());
    }
}
