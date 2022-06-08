package com.example.newspringcourse.annotations.models;

import com.example.newspringcourse.annotations.interfaces.Music;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doInit(){
        System.out.println("Doing my initialization");
    }

    public void doDestroy(){
        System.out.println("Do my destroy");
    }
    @Override
    public String getSong() {
        return "Sonata #6";
    }
}
