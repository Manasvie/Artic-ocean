//package com.example.FirstProject.artgallery.controllers;
//
//import com.example.FirstProject.artgallery.models.Artist;
//import com.example.FirstProject.artgallery.repositories.ArtistRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping("/artist")
//public class ArtistController {
//
//    @Autowired
//    private ArtistRepository artistRepository;
//
//    @GetMapping("/dashboard")
//    public String dashboard() {
//        return "artist_dashboard"; // Return the artist dashboard template
//    }
//
//    @GetMapping("/profile")
//    public String profileForm(Model model) {
//        model.addAttribute("artist", new Artist());
//        return "artist_profile"; // Return the profile management template
//    }
//
//    @PostMapping("/profile")
//    public String saveProfile(@ModelAttribute Artist artist) {
//        artistRepository.save(artist);
//        return "redirect:/artist/dashboard"; // Redirect to the dashboard after saving
//    }
//}
