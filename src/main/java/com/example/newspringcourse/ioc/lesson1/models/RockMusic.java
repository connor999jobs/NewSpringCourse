package com.example.newspringcourse.ioc.lesson1.models;

import com.example.newspringcourse.ioc.lesson1.interfaces.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Saliva - Always";
    }
}
