package com.example.copyspotify.controller;

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
        add(new Music("1", "Песя 1", Collections.singletonList("Артист 1"),Collections.singletonList("rock"), "dffd"));
        add(new Music("2", "Песня 2", Collections.singletonList("Артист 1"),Collections.singletonList("rock"), "dffd"));
        add(new Music("3", "Песня 3", Collections.singletonList("Артист 3"),Collections.singletonList("rock"), "dffd"));
        add(new Music("4", "Таблетка", Collections.singletonList("Мукка"),Collections.singletonList("rock"), "dffd"));
        add(new Music("5", "Fake Love", Collections.singletonList("KVSTR"),Collections.singletonList("rock"), "dffd"));
        add(new Music("6", "Минутная слабость", Collections.singletonList("ТЕППО"),Collections.singletonList("rock"), "dffd"));
        add(new Music("7", "Вселенная", Collections.singletonList("Мукка"),Collections.singletonList("rock"), "dffd"));
        add(new Music("8", "Ненавижу порядок", Collections.singletonList("Sqwore"),Collections.singletonList("rock"), "dffd"));
        add(new Music("9", "Kilua", Collections.singletonList("zxCursed"),Collections.singletonList("rock"), "dffd"));
    }};

    @GetMapping
    public List<Music> listMusic()
    {
        List<Music> newMusic = new ArrayList<Music>();
        newMusic = this.music;
        return newMusic;
    }

    @GetMapping("searchByName/{name}")
    public List<Music> getMusicByName(@PathVariable String name)
    {
        List<Music> resultMusicByName = new ArrayList<Music>();
        for (Music value : this.music) {
            if (LevDiv.levenshteinDistance(value.getName(),name)<=2)
                resultMusicByName.add(value);
        }
        if(resultMusicByName.isEmpty())
        {
            return null;
        }
        return resultMusicByName;
    }

    @GetMapping("searchById/{id}")
    public List<Music> getMusicById(@PathVariable String id)
    {
        List<Music> resultMusicById = new ArrayList<Music>();
        for (Music value : this.music) {
            if (value.getId().equals(id)) {
                resultMusicById.add(value);
                return resultMusicById;
            }
        }
        return null;
    }

    @GetMapping("searchByArtist/{artist}")
    public List<Music> getMusicByArtist(@PathVariable String artist)
    {
        List<Music> resultMusicByArtist = new ArrayList<Music>();
        for (Music value : this.music) {
            for(int k=0;k<value.getArtist().size();k++)
            {
                if(value.getArtist().get(k).equals(artist))
                {
                    resultMusicByArtist.add(value);
                }
            }
        }
        if(resultMusicByArtist.isEmpty())
            return null;
        else
            return resultMusicByArtist;
    }


}
