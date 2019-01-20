package data_layer;

import java.util.HashSet;

public class Ticket {

    private String ticketName;
    private float ticketPrice;
    private HashSet<TicketType> ticketTypeList = new HashSet<>();


    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public void setTicketTypeList(HashSet<TicketType> ticketTypeList) {
        this.ticketTypeList = ticketTypeList;
    }

    public HashSet<TicketType> getTicketTypeList() {
        return ticketTypeList;
        }


}
