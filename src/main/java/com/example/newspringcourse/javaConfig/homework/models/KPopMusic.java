package com.example.newspringcourse.javaConfig.homework.models;

import com.example.newspringcourse.javaConfig.homework.interfacess.NewMusic;

public class KPopMusic implements NewMusic {
    @Override
    public String getMusic() {
        return "PSY - 'That That (prod. & feat. SUGA of BTS)' MV";
    }
}
