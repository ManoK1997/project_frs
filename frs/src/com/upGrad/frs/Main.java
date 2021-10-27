package com.upGrad.frs;

public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("12345", "Salem",
                "Chennai","1A", 10000, false, null, null, "Dinner");

        Ticket touristTicket = new TouristTicket("67890", "India", "Canada",
                "2A", 20000, false, null, null,
                "New LakeView Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.isCancelled());
        System.out.println(ticket.getPassenger());
        System.out.println(ticket.getPnr());
        System.out.println(ticket.checkStatus());
    }
}
