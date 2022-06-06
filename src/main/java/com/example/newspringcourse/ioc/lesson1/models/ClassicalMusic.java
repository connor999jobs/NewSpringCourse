package com.example.newspringcourse.ioc.lesson1.models;

import com.example.newspringcourse.ioc.lesson1.interfaces.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Sonata #6";
    }
}
