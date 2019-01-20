package data_layer;

public class Venue {

    //add field int id
    private String venueName;
    private String venueLocation;

    public String getVenueLocation() {
        return venueLocation;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    @Override
    public String toString() {
        return venueName.toString();
    }
}

