package DTO;

import Domain.Track;

import java.util.UUID;

public class TrackDTO {

    private String id = UUID.randomUUID().toString();
    String name;
    Long likes;
    String genre;

    int duration;


    public TrackDTO(String name, Long likes, int duration, String genre){
        this.name = name;
        this.likes = likes;
        this.duration = duration;
        this.genre = genre;
    }

    public TrackDTO(Track track){
        this.id = track.getId();
        this.name = track.getName();
        this.likes = track.getLikes();
        this.duration = track.getDuration();
        this.genre = track.getGenre();
    }

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

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }



}
