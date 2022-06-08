package com.example.newspringcourse.javaConfig.homework.config;

import com.example.newspringcourse.javaConfig.homework.interfacess.NewMusic;
import com.example.newspringcourse.javaConfig.homework.models.KPopMusic;
import com.example.newspringcourse.javaConfig.homework.models.NewMusicPlayer;
import com.example.newspringcourse.javaConfig.homework.models.PhonkMusic;
import com.example.newspringcourse.javaConfig.homework.models.RelaxMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.example.newspringcourse.javaConfig.homework")
@PropertySource("classpath:musicPlayer.properties")
public class NewSpringConfig {

    @Bean
    public KPopMusic kPopMusic(){
        return new KPopMusic();
    }

    @Bean
    public PhonkMusic phonkMusic(){
        return new PhonkMusic();
    }

    @Bean
    public RelaxMusic relaxMusic(){
        return new RelaxMusic();
    }

    @Bean
    public List<NewMusic> musicList(){
        return Arrays.asList(kPopMusic(),phonkMusic(),relaxMusic());
    }

    @Bean
    public NewMusicPlayer newMusicPlayer(){
        return new NewMusicPlayer(musicList());
    }
}
