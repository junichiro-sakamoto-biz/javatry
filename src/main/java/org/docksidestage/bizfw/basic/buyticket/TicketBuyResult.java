package org.docksidestage.bizfw.basic.buyticket;

// TODO sakamoto 同じpackageではわざわざimportしなくてよい by winkichanwi

public class TicketBuyResult {
    private Ticket ticket;
    private int change;

    public TicketBuyResult(int money, int change, int type) {
        // done sakamoto ここはMultidayTicketを生成するがOneDayPassportを買う場合もMultidayTicketですか？ by winkichanwi
        // Ticketを抽象クラスにした意味がなくなってしまいますが、まとめてしまった方がシンプルなためこうしたいと思ってます。
        // NOTE ありがとうございます。そうですね、今のシナリオ的にはOneDayTicketをわざわざ切り出す必要がなくなるようで、いいと思っています。 by winkichanwi
        // TODO sakamoto じゃ、クイズです、どういうシナリオでOneDayTicketが必要のようになるでしょう？ by winkichanwi
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