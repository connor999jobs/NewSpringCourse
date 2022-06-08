package com.example.newspringcourse.javaConfig.homework.models;

import com.example.newspringcourse.javaConfig.homework.interfacess.NewMusic;
import org.springframework.stereotype.Component;

import java.util.List;


public class PhonkMusic implements NewMusic {
    @Override
    public String getMusic() {
        return "vendetta! · MUPP · Sadfriendd · Max Apostol";
    }
}
