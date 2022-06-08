package com.example.newspringcourse.annotations.models;

import com.example.newspringcourse.annotations.interfaces.Music;
import org.springframework.stereotype.Component;

@Component("remixMusic")

public class RemixMusic implements Music {
    @Override
    public String getSong() {
        return "NIGHTCORE - huken x murkish - WASTED [Juice Wrld]";
    }
}
