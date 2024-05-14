package com.example.FirstProject.artgallery.Service;

import java.util.Optional;
import com.example.FirstProject.artgallery.models.Artist;
import com.example.FirstProject.artgallery.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public void saveProfile(Artist artist){
        artistRepository.save(artist);
    }

    public Optional<Artist> getProfileById(String id) {
        return artistRepository.findById(id);
    }

}

