package org.docksidestage.bizfw.basic.buyticket;

public class MultipledayTicket implements Ticket {
    int displayPrice;
    // TODO sakamoto intはprimitive typeなので、0と初期化する必要ないよ by winkichanwi
    int ticketType = 0;
    int remainingDay = 0;

    public MultipledayTicket(int displayPrice, int ticketType) {
        this.displayPrice = displayPrice;
        this.ticketType = ticketType;
        this.remainingDay = ticketType;
    }

    public void doInPark() {
        this.remainingDay--;
    }

    public int getDisplayPrice() {
        return displayPrice;
    }

    public int getTicketType() {
        return this.ticketType;
    }

    public boolean isAlreadyIn() {
        return this.remainingDay <= 0;
    }
}