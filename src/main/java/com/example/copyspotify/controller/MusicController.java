package com.example.copyspotify.controller;

import com.example.copyspotify.exceptions.NotFoundException;
import com.example.copyspotify.model.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("music")
public class MusicController {
    private final List<Music> music = new ArrayList<>(){{
        add(new Music("1", "Песя 1", "Артист 1",Collections.singletonList("rock"), "dffd"));
        add(new Music("2", "Песня 2", "Артист 2",Collections.singletonList("rock"), "dffd"));
        add(new Music("3", "Песня 3", "Артист 3",Collections.singletonList("rock"), "dffd"));
    }};

    @GetMapping
    public List<Music> listMusic()
    {
        List<Music> newMusic = new ArrayList<Music>();
        newMusic = this.music;
        return newMusic;
    }


}
