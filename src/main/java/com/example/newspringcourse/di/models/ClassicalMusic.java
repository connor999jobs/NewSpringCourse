package com.example.newspringcourse.di.models;

import com.example.newspringcourse.di.interfaces.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Sonata #6";
    }
}
