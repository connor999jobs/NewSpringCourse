package com.example.newspringcourse.javaConfig.lesson.models;

import com.example.newspringcourse.javaConfig.lesson.interfaces.Music;
import org.springframework.stereotype.Component;

@Component("rockMusics")
public class RockMusics implements Music {
    @Override
    public String getSong() {
        return "Saliva - Always";
    }
}
