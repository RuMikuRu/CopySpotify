package com.example.copyspotify.dto;

import com.example.copyspotify.model.Music;
import org.springframework.stereotype.Component;

@Component
public class MusicDTOFactories {
    public MusicDTO makeMusicDTO(Music music)
    {
        return MusicDTO.builder()
                .id(music.getId())
                .nameMusic(music.getName())
                .artist(music.getArtist())
                .tags(music.getTags())
                .pathFiles(music.getPathFiles())
                .build();
    }
}
