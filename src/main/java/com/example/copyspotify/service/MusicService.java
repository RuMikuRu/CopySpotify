package com.example.copyspotify.service;

import com.example.copyspotify.dto.MusicDTO;


import java.util.List;

public interface MusicService {
    List<MusicDTO> searchMusic(String q);

    List<MusicDTO> fetchAllProduct();
}
