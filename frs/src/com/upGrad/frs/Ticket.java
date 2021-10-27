package com.upGrad.frs;

public abstract class Ticket {
    private String pnr;
    private String departure;
    private String destination;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String departure, String destination, String seatNo, float price, boolean cancelled,
                  Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String checkStatus() {
        return cancelled ? "Cancelled" : "Confirmed";
    }

    public void cancel() {
        cancelled = true;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
