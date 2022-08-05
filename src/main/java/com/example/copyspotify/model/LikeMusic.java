package com.example.copyspotify.model;

import java.util.HashMap;
import java.util.List;

public class LikeMusic {
    private HashMap<String, Music> likeMusic;

    public LikeMusic(HashMap<String, Music> likeMusic) {
        this.likeMusic = likeMusic;
    }

    public HashMap<String, Music> getLikeMusic() {
        return likeMusic;
    }

    public void setLikeMusic(HashMap<String, Music> likeMusic) {
        this.likeMusic = likeMusic;
    }
}
