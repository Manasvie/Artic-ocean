package com.example.FirstProject.artgallery.Service;

import com.example.FirstProject.artgallery.models.Artwork;
import com.example.FirstProject.artgallery.repositories.ArtworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArtworkService {

    @Autowired
    private ArtworkRepository artworkRepository;

    public void saveProfile(Artwork artwork){
        artworkRepository.save(artwork);}
    }