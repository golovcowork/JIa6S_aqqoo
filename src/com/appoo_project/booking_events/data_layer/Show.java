package data_layer;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Show {

    private String showName;
    private List<Seat> seatList;
    private List<Venue> venueList;
    private ConcurrentHashMap<Show,Venue> showVenueConcurrentHashMap;

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public List<Venue> getVenueList() {
        return venueList;
    }

    public void setVenueList(List<Venue> venueList) {
        this.venueList = venueList;
    }


    public ConcurrentHashMap<Show, Venue> getShowVenueConcurrentHashMap() {
        return showVenueConcurrentHashMap;
    }

    public void setShowVenueConcurrentHashMap(ConcurrentHashMap<Show, Venue> showVenueConcurrentHashMap) {

        this.showVenueConcurrentHashMap = showVenueConcurrentHashMap ;
    }

    @Override
    public String toString() {
        return showName.toString();
    }
}
