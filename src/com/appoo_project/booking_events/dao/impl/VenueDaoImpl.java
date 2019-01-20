package dao.impl;

import dao.VenueDao;
import data_layer.Venue;

public class VenueDaoImpl implements VenueDao {

    @Override
    public void saveVenue(Venue venue) {

        String sql = "insert into venue set name =" + venue.getVenueName();

        //DatabaseConnection.getInstance().getConnection().createStatement() //todo continue

    }
}
