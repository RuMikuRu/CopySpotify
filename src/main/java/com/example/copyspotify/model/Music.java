package com.example.copyspotify.model;

import java.util.List;

//объект музыка
public class Music {
    private String id;

    private String nameMusic;

    private String artist;

    private String tags;

    private String pathFiles;

    public Music(String id, String nameMusic, String artist, String tags, String pathFiles) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.artist = artist;
        this.tags = tags;
        this.pathFiles = pathFiles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return nameMusic;
    }

    public void setName(String name) {
        this.nameMusic = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPathFiles() {
        return pathFiles;
    }

    public void setPathFiles(String pathFiles) {
        this.pathFiles = pathFiles;
    }
}
