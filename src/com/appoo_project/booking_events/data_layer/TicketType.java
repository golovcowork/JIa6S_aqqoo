package data_layer;

public class TicketType {

    private String ticketType;

    public String getTicketType() {
       return ticketType.toString();
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {

        return ticketType.toString();
    }

}
