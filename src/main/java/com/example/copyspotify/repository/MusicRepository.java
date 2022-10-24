package com.example.copyspotify.repository;

import com.example.copyspotify.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
    Optional<Music> findByName(String name);

    Stream<Optional> streamAllBy();
}
