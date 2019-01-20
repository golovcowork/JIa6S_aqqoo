import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String args[]) {

        Ticket ticket = new Ticket();
        TicketType vip = new TicketType();
        TicketType zone1 = new TicketType();
        TicketType zone2 = new TicketType();

        //am dat denumire tipurilor de bilete ca sa vadem ordinea
        vip.setTicketType("vip");
        zone1.setTicketType("Zone1");
        zone2.setTicketType("Zone2");
        ticket.setTicketName("Bilet");
        //hashset e implementat in clasa Ticket

        //adaugam elemente
        ticket.ticketTypeList.add(zone1);
        ticket.ticketTypeList.add(zone2);
        ticket.ticketTypeList.add(vip);
        //adaugam null
        ticket.ticketTypeList.add(null);
        //adaugam dublicat si se face ovewrite
        ticket.ticketTypeList.add(vip);
        ticket.ticketTypeList.add(null);
        ticket.ticketTypeList.add(zone1);

        //Afisam HashSet elemente, si vedem ca ele nu sunt ordonate
        System.out.println(ticket.ticketTypeList);
        //stergem elementul vip
        System.out.println(ticket.ticketTypeList.remove(vip));
        //Afisam din nou HashSet elemente, si vedem ca ele nu sunt ordonate
        System.out.println(ticket.ticketTypeList);

        System.out.println("\n *********************** ");

        //cream obiecte de tip venue si show
        Venue meteora = new Venue();
        Venue moldovafilm = new Venue();
        Show napalm = new Show();
        Show sfera = new Show();
        Show teatru = new Show();
        //le numim sa le diferentiem
        meteora.setVenueLocation("columna");
        meteora.setVenueName("meteora");
        moldovafilm.setVenueLocation("telecentro");
        moldovafilm.setVenueName("moldovafilm");
        napalm.setShowName("napalmdeath");
        sfera.setShowName("sferaa");
        teatru.setShowName("teareo");
        //cream un concurrenthashmap
        ConcurrentHashMap<Show,Venue> showVenueConcurrentHashMap= new ConcurrentHashMap<>();
        //adaugam elemente
        showVenueConcurrentHashMap.put(napalm,meteora);
        showVenueConcurrentHashMap.put(teatru,moldovafilm);
        //afisam
        System.out.println(showVenueConcurrentHashMap);
        //modificam
        showVenueConcurrentHashMap.put(sfera,meteora);
        showVenueConcurrentHashMap.put(teatru,meteora);
        //atribuim hashmapul creat anterior atributului din clasa show
        napalm.setShowVenueConcurrentHashMap(showVenueConcurrentHashMap);
        //afisam
        System.out.println(napalm.getShowVenueConcurrentHashMap());
    }


}
/*
HashSet doesn’t maintain any order, the elements would be returned in any random order.
HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
HashSet allows null values however if you insert more than one nulls it would still return only one null value.
HashSet is non-synchronized.
The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException if
HashSet has been modified after creation of iterator, by any means except iterator’s own remove method.
 */