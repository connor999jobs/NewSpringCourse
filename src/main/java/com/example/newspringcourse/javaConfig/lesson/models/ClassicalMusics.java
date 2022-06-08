package com.example.newspringcourse.javaConfig.lesson.models;

import com.example.newspringcourse.javaConfig.lesson.interfaces.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("classicalMusics")
@Scope("singleton")
public class ClassicalMusics implements Music {
    public ClassicalMusics() {
    }

    public static ClassicalMusics getClassicalMusic(){
        return new ClassicalMusics();
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
