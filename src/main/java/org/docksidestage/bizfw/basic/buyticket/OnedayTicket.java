package org.docksidestage.bizfw.basic.buyticket;

public class OnedayTicket implements Ticket {
    int displayPrice;
    boolean alreadyIn = false;
    public OnedayTicket(int displayPrice) {
        this.displayPrice = displayPrice;
    }
    public void doInPark() {
        this.alreadyIn = true;
    }

    public int getDisplayPrice() {
        return displayPrice;
    }

    public int getTicketType() {
        return 1;
    }

    public boolean isAlreadyIn() {
        return this.alreadyIn;
    }
}
