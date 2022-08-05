package com.example.copyspotify.controller;

import com.example.copyspotify.model.LikeMusic;
import com.example.copyspotify.model.Music;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


@RestController
@RequestMapping("like_music")
public class LikeMusicController {
    int counter = 0;

    private final HashMap<String, Music> idLikeMusic = new HashMap<>()
    {{
        put("1", new Music("1", "Артист 1", Collections.singletonList("Певец 1"),
                Collections.singletonList("rock"), "pfpdpf"));
    }};

    private final LikeMusic likeMusic = new LikeMusic(idLikeMusic);

    @GetMapping
    public LikeMusic getLikeMusicListId()
    {
        return likeMusic;
    }

    @PostMapping
    public LikeMusic addLikeMusic(@RequestBody Music newLikeMusicId){
        this.counter++;
        likeMusic.getLikeMusic().put(String.valueOf(counter), newLikeMusicId);
        return likeMusic;
    }
}
