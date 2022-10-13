package com.example.copyspotify.controller;

import com.example.copyspotify.model.Music;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("music")
public class MusicController {
    private final List<Music> music = new ArrayList<>(){{
        add(new Music("1", "Песя 1", "Артист 1","rock", "dffd"));
        add(new Music("2", "Песня 2", "Артист 1","rock", "dffd"));
        add(new Music("3", "Песня 3", "Артист 3","rock", "dffd"));
        add(new Music("4", "Таблетка", "Мукка","rock", "dffd"));
        add(new Music("5", "Fake Love", "KVSTR","rock", "dffd"));
        add(new Music("6", "Минутная слабость", "ТЕППО","rock", "dffd"));
        add(new Music("7", "Вселенная", "Мукка","rock", "dffd"));
        add(new Music("8", "Ненавижу порядок", "Sqwore","rock", "dffd"));
        add(new Music("9", "Kilua", "zxCursed","rock", "dffd"));
    }};


    //выводит список всей музыки на сервере
    @GetMapping
    public List<Music> listMusic()
    {
        List<Music> newMusic = new ArrayList<Music>();
        newMusic = this.music;
        return newMusic;
    }

    //поиск по имени
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

    //поиск по id
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

    //поиск по артистам
    /*
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
*/

}
