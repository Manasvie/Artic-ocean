package com.example.FirstProject.artgallery.controllers;

import com.example.FirstProject.artgallery.Service.ArtistService;
import com.example.FirstProject.artgallery.models.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Map;

@RestController
@RequestMapping("artist")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping("/profile")
    public List<Artist> getAll() {
        return null;
//        return new ArrayList<>(ArtistProfiles.values());
    }

    @PostMapping("/profile")
    public boolean createProfile(@RequestBody Artist artist) {
        artistService.saveProfile(artist);
        return true; // Redirect to the dashboard after saving
    }

    @GetMapping("/profile/{id}")
    public Optional<Artist> getProfile(@PathVariable String id) {
        return artistService.getProfileById(id);
    }
}