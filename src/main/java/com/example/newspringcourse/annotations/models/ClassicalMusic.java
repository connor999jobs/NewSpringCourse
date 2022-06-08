package com.example.newspringcourse.annotations.models;

import com.example.newspringcourse.annotations.interfaces.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("classicalMusic")
@Scope("singleton")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Do my destroy");
    }
    @Override
    public String getSong() {
        return "Sonata #6";
    }
}
