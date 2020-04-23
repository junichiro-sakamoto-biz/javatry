package org.docksidestage.bizfw.basic.buyticket;

import org.docksidestage.bizfw.basic.buyticket.MultipledayTicket;

public class TicketBuyResult {
    private Ticket ticket;
    private int change;

    public TicketBuyResult(int money, int change, int type) {
        this.ticket = new MultipledayTicket(money, type);
        this.change = change;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getChange() {
        return change;
    }
}