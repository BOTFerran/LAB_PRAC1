package Domain;

import DTO.TrackDTO;

import java.util.List;

public class Track {

    String id;
    String name;
    Long lines;
    int duration;
    String genre;

    public Track(){}

    public Track(TrackDTO trackDTO){
        this.id = trackDTO.getId();
        this.name = trackDTO.getName();
        this.lines = trackDTO.getLines();
        this.duration = trackDTO.getDuration();
        this.genre = trackDTO.getGenre();
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
