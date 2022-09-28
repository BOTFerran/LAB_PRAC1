package DTO;

import Domain.Track;

import java.util.UUID;

public class TrackDTO {

    private String id = UUID.randomUUID().toString();
    String name;
    Long lines;
    String genre;

    int duration;


    public TrackDTO(String name, Long lines, int duration, String genre){
        this.name = name;
        this.lines = lines;
        this.duration = duration;
        this.genre = genre;
    }

    public TrackDTO(Track track){
        this.id = track.getId();
        this.name = track.getName();
        this.lines = track.getLines();
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

    public Long getLines() {
        return lines;
    }

    public void setLines(Long lines) {
        this.lines = lines;
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
