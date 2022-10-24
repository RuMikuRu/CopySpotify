package com.example.copyspotify.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicDTO {
    int id;
    String nameMusic;
    String artist;
    String tags;
    String pathFiles;
}
