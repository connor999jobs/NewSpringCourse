package com.example.newspringcourse.annotations.homework.models;

import com.example.newspringcourse.annotations.homework.interfaces.MusicH;
import com.example.newspringcourse.annotations.interfaces.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusicH implements MusicH {
    private List<String> classicalMusic = new ArrayList<>();

    {
        classicalMusic.add("Mozart – Eine kleine Nachtmusik");
        classicalMusic.add("Beethoven – Für Elise");
        classicalMusic.add("Puccini – 'O mio babbino caro' from Gianni Schicchi");
    }

    @Override
    public List<String> getListMusic() {
        return classicalMusic;
    }
}
