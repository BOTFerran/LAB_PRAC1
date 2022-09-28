package DTO;

public class TrackDTO {

    Long id;
    String name;
    Long lines;
    String genre;

    int duration;


    public TrackDTO(Long id, String name, Long lines, int duration, String genre){
        this.id = id;
        this.name = name;
        this.lines = lines;
        this.duration = duration;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
