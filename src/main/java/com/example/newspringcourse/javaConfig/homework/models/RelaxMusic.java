package com.example.newspringcourse.javaConfig.homework.models;

import com.example.newspringcourse.javaConfig.homework.interfacess.NewMusic;

public class RelaxMusic implements NewMusic {
    @Override
    public String getMusic() {
        return "Hoogway x Softy - Only you ";
    }
}
