package com.example.FirstProject.artgallery.repositories;

        import com.example.FirstProject.artgallery.models.Artwork;
        import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtworkRepository extends MongoRepository<Artwork, String> {
}