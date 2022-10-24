package com.example.copyspotify.controller;

import com.example.copyspotify.dto.MusicDTO;
import com.example.copyspotify.model.Music;
import com.example.copyspotify.repository.MusicRepository;
import com.example.copyspotify.service.MusicService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("music")
public class MusicController {
    private MusicService musicService;

    //выводит список всей музыки на сервере
    @GetMapping
    public @ResponseBody ResponseEntity<List<MusicDTO>> listMusic()
    {
        return ResponseEntity.ok(musicService.fetchAllProduct());
    }
    //поиск по имени
    @GetMapping("searchByName/{name}")
    public ResponseEntity<List<MusicDTO>> getMusicByName(@PathVariable String name)
    {
        return ResponseEntity.ok(musicService.searchMusic(name));
    }
/*
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
