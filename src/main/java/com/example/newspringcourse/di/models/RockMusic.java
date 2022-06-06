package com.example.newspringcourse.di.models;

import com.example.newspringcourse.di.interfaces.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Saliva - Always";
    }
}
