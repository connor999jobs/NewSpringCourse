package com.example.newspringcourse.ioc.lesson1.models;

import com.example.newspringcourse.ioc.lesson1.interfaces.Music;

public class RemixMusic implements Music {
    @Override
    public String getSong() {
        return "NIGHTCORE - huken x murkish - WASTED [Juice Wrld]";
    }
}
