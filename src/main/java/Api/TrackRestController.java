package Api;
import DTO.TrackDTO;
import Controller.TrackController;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TrackRestController {

    private TrackController trackController;

    public TrackRestController (TrackController trackController) {this.trackController = trackController;}

    @PostMapping("travels")
    public TrackDTO createTrack(@RequestBody TrackDTO trackDTO) throws Exception {
        return this.trackController.createTrack(trackDTO);
    }

    @GetMapping("travels")
    public List<TrackDTO> getAllTracks () {
        return trackController.getTracks();
    }

    @DeleteMapping("travels")
    public void deleteAllTracks () {
        trackController.deleteTracks();
    }

    @GetMapping("travels/{travelId}")
    public TrackDTO getTrack (@PathVariable String trackId) {
        return trackController.getTrack(trackId);
    }

    @DeleteMapping("travels/{travelId}")
    public void deleteTracklById (@PathVariable String trackId) {
        trackController.deleteTrack(trackID);
    }

}
