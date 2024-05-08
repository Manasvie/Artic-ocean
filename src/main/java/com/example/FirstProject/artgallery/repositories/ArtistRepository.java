package com.example.FirstProject.artgallery.repositories;

import com.example.FirstProject.artgallery.models.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepository extends MongoRepository<Artist, String> {
        // Custom query methods can be defined here if needed
}

