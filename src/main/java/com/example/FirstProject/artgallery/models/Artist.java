//package com.example.FirstProject.artgallery.models;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;
//import java.util.HashSet;
//import java.util.Set;
//
//@Document("artists") // Name of the MongoDB collection
//public class Artist {
//    @Id
//    private String id;
//
//    @Field("name")
//    private String name;
//
//    @Field("bio")
//    private String bio;
//
//    // Relationship with Artworks can be represented by a set of IDs or by embedded documents
//    private Set<String> artworkIds = new HashSet<>();
//
//    // Getters and setters
//}
