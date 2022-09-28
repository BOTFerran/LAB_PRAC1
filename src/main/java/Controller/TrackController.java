package Controller;

import DTO.TrackDTO;
import Domain.Track;
import Respository.TrackRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrackController {
    private TrackRepository repository;

    public TrackController(TrackRepository repository){this.repository = repository;}

    public TrackDTO createTrack(TrackDTO trackDTO){
        Track track = new Track(trackDTO);
        repository.save(track);
        return new TrackDTO(track);
    }

    public void deleteTrack(String id){
        repository.delete(repository.findById(id).get());
    }

    public void editTrack(String id, String name, Long likes, int duration, String genre){
        Track track = repository.findById(id).get();
        TrackDTO updatedTrack = new TrackDTO(name, likes, duration, genre);
        updatedTrack.setId(track.getId());
        repository.delete(track);
        repository.save(new Track(updatedTrack));
    }

    public List<TrackDTO> getTracks(){
        List<Track> result = new ArrayList<>();
        Iterator<Track> iterator = this.repository.findAll().iterator();
        iterator.forEachRemaining(result::add);
        return result.stream().map(x -> new TrackDTO(x)).toList();
    }

    public void deleteTracks(){ repository.deleteAll();}

    public TrackDTO getTrack(String id){ return new TrackDTO(repository.findById(id).get());}
}
