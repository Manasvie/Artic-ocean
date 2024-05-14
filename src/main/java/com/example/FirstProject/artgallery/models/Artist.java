package com.example.FirstProject.artgallery.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "artists") // Name of the MongoDB collection
public class Artist {
    @Id
    private String id;
    private String name;

    private String bio;

    // Relationship with Artworks can be represented by a set of IDs or by embedded documents
//    private Set<String> artworkIds = new HashSet<>();

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

//    public Set<String> getArtworkIds() {
//        return artworkIds;
//    }

//    public void setArtworkIds(Set<String> artworkIds) {
//        this.artworkIds = artworkIds;
//    }
}
