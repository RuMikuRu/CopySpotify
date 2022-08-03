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
        add(new Music("1", "fdfsfs", "Мукка",Collections.singletonList("rock"), "dffd"));
        add(new Music("2", "На твиче", "нексюша",Collections.singletonList("rock"), "dffd"));
        add(new Music("3", "Психопат", "Midix",Collections.singletonList("rock"), "dffd"));
    }};

    @GetMapping
    public List<Music> listMusic()
    {
        List<Music> newMusic = new ArrayList<Music>();
        newMusic = this.music;
        return newMusic;
    }


}
