package com.example.copyspotify.model;

import java.util.List;


public class Music {
    private String id;

    private String nameMusic;

    private List<String> artist;

    private List<String> tags;

    private String pathFiles;

    public Music(String id, String nameMusic, List<String> artist, List<String> tags, String pathFiles) {
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

    public List<String> getArtist() {
        return artist;
    }

    public void setArtist(List<String> artist) {
        this.artist = artist;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPathFiles() {
        return pathFiles;
    }

    public void setPathFiles(String pathFiles) {
        this.pathFiles = pathFiles;
    }
}
