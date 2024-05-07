//package com.example.FirstProject.artgallery.controllers;
//
////public class ArtworkController {
////}
//
//        import com.example.FirstProject.artgallery.models.Artwork;
//        import com.example.FirstProject.artgallery.repositories.ArtworkRepository;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.stereotype.Controller;
//        import org.springframework.ui.Model;
//        import org.springframework.web.bind.annotation.*;
//        import org.springframework.web.multipart.MultipartFile;
//
//@Controller
//@RequestMapping("/artist")
//public class ArtworkController {
//
//    @Autowired
//    private ArtworkRepository artworkRepository;
//
//    @GetMapping("/upload")
//    public String uploadForm(Model model) {
//        model.addAttribute("artwork", new Artwork());
//        return "art_upload"; // Return the art upload template
//    }
//
////    @PostMapping("/upload")
////    public String uploadArtwork(@RequestParam("image") MultipartFile image,
////                                @ModelAttribute Artwork artwork) {
////        // Assume that the image upload logic is implemented (e.g., Cloudinary integration)
////        // Set the image URL after upload
////        artwork.setImageUrl("uploaded_image_url"); // Placeholder for the actual image URL
////        artworkRepository.save(artwork);
////        return "redirect:/artist/dashboard"; // Redirect to the dashboard after upload
////    }
//}
