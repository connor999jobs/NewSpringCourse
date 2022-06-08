package com.example.newspringcourse.annotations.models;

import com.example.newspringcourse.annotations.interfaces.Music;
import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Saliva - Always";
    }
}
