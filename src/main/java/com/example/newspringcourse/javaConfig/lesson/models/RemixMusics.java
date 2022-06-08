package com.example.newspringcourse.javaConfig.lesson.models;

import com.example.newspringcourse.javaConfig.lesson.interfaces.Music;
import org.springframework.stereotype.Component;

@Component("remixMusics")

public class RemixMusics implements Music {
    @Override
    public String getSong() {
        return "NIGHTCORE - huken x murkish - WASTED [Juice Wrld]";
    }
}
