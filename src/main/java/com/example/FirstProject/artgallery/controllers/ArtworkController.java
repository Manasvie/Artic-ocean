package com.example.FirstProject.artgallery.controllers;

        import com.example.FirstProject.artgallery.models.Artist;
        import com.example.FirstProject.artgallery.models.Artwork;
        import com.example.FirstProject.artgallery.repositories.ArtworkRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.multipart.MultipartFile;

        import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtworkController {

    @Autowired
    private ArtworkRepository artworkRepository;

    @GetMapping("/upload")
    public List<Artwork> getAll() {
        return null;
    }

    @PostMapping("/upload")
    public boolean uploadArtwork(@RequestBody Artwork artwork) {
        artworkRepository.save(artwork);
        return true; // Redirect to the dashboard after upload
    }
}
