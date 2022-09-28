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
    public TrackDTO createTravel(@RequestBody TrackDTO trackDTO) throws Exception {
        return this.trackController.createTrack(trackDTO);
    }

    @GetMapping("travels")
    public List<TrackDTO> getAllTravels () {
        return trackController.getAllTracks();
    }

    @DeleteMapping("travels")
    public void deleteAllTravels () {
        travelController.deleteAllTravels();
    }

    @GetMapping("travels/{travelId}")
    public TravelDTO getTravel (@PathVariable String travelId) {
        return travelController.getTravel(travelId);
    }

    @DeleteMapping("travels/{travelId}")
    public void deleteTravelById (@PathVariable String travelId) {
        travelController.deleteTravel(travelId);
    }

}
