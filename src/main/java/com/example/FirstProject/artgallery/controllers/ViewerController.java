package com.example.FirstProject.artgallery.controllers;

//public class ViewerController {
//}

import com.example.FirstProject.artgallery.models.Artwork;
import com.example.FirstProject.artgallery.repositories.ArtworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/viewer")
public class ViewerController {

    @Autowired
    private ArtworkRepository artworkRepository;

    @GetMapping("/gallery")
    public String artGallery(Model model) {
        List<Artwork> artworks = artworkRepository.findAll();
        model.addAttribute("artworks", artworks);
        return "art_gallery"; // Return the art gallery template
    }

    @GetMapping("/art/{id}")
    public String artDetails(@PathVariable Long id, Model model) {
        Artwork artwork = artworkRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid artwork ID"));
        model.addAttribute("artwork", artwork);
        return "art_details"; // Return the art details template
    }
}
