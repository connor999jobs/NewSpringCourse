package com.example.newspringcourse.annotations.models;

import com.example.newspringcourse.annotations.interfaces.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Saliva - Always";
    }
}
