package org.docksidestage.bizfw.basic.buyticket;

public class MultipledayTicket implements Ticket {
    int displayPrice;
    // done sakamoto intはprimitive typeなので、0と初期化する必要ないよ by winkichanwi
    int ticketType;
    int remainingDay;

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