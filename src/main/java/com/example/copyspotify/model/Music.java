package com.example.copyspotify.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

//объект музыка
@Entity
@Table(name = "mymusic")
public class Music {
    @Id
    private int id;

    @Column(name = "nameMusic")
    private String nameMusic;

    @Column(name = "artist")
    private String artist;

    @Column(name = "tags")
    private String tags;

    @Column(name = "pathFiles")
    private String pathFiles;

    public Music(int id, String nameMusic, String artist, String tags, String pathFiles) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.artist = artist;
        this.tags = tags;
        this.pathFiles = pathFiles;
    }

    public Music() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
