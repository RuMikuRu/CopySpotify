package com.example.copyspotify.service;

import com.example.copyspotify.controller.LevDiv;
import com.example.copyspotify.dto.MusicDTO;
import com.example.copyspotify.dto.MusicDTOFactories;
import com.example.copyspotify.model.Music;
import com.example.copyspotify.repository.MusicRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Transactional
public class MusicServiceImp implements MusicService{

    private final MusicDTOFactories musicDTOFactories;
    private final MusicRepository musicRepository;

    public MusicServiceImp(MusicDTOFactories musicDTOFactories, MusicRepository musicRepository) {
        this.musicDTOFactories = musicDTOFactories;
        this.musicRepository = musicRepository;
    }

    @Override
    public List<MusicDTO> searchMusic(String q) {
        Stream<Music> musicStream;
        musicStream = musicRepository.streamAllBy().filter(music ->{
            int c = LevDiv.levenshteinDistance(q, music.getName());
            return c > 2;

        });
        return musicStream.map(musicDTOFactories::makeMusicDTO).collect(Collectors.toList());
    }

    @Override
    public List<MusicDTO> fetchAllProduct() {
        return null;
    }
}
