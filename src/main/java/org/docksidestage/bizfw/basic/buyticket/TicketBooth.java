/*
 * Copyright 2019-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author jflute
 */

public class TicketBooth {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final int[] prices = {
            0,
            7400,
            13200,
            0,
            22400
    };

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // done quantity はoneDayPassport、twoDayPassport、fourDayPassportも共有しているという意味ですか？ winkichanwi
    // done sakamoto 修正ありがとうございます。もう一つの質問、返事だけでもいいし、修正してもいいですが、
    //               100DayPassportが登場したら配列で管理することはどうなるでしょうか by winkichanwi
    // Hashmapを使おうと思ってます。 by sakamoto
    private static final int MAX_QUANTITY = 10;
    // TODO sakamoto nit: 複数はquantities by winkicahnwi
    private int[] quantities = {
            0,
            MAX_QUANTITY,
            MAX_QUANTITY,
            0,
            MAX_QUANTITY
    };
    private Integer salesProceeds;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TicketBooth() {
    }

    // ===================================================================================
    //                                                                          Buy Ticket
    //                                                                          ==========
    // done buyOneDayPassport、buyTwoDayPassport、buyFourDayPassportの処理似ているところありますでしょうか？あるなら共通化できないのでしょう？ winkichanwi
    public TicketBuyResult buyPassport(int handedMoney, int type) {
        if (!(type == 1 || type == 2 || type == 4)) {
            throw new RuntimeException("ticket type not supported");
        }
        int price = prices[type];
        if (quantities[type] <= 0) {
            throw new TicketSoldOutException("Sold out");
        }
        if (handedMoney < price) {
            throw new TicketShortMoneyException("Short money: " + handedMoney);
        }
        quantities[type]--;
        if (salesProceeds != null) {
            salesProceeds += price;
        } else {
            salesProceeds = price;
        }
        return new TicketBuyResult(price, handedMoney - price, type);
    }
    public static class TicketSoldOutException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public TicketSoldOutException(String msg) {
            super(msg);
        }
    }

    public static class TicketShortMoneyException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public TicketShortMoneyException(String msg) {
            super(msg);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int getQuantity(int type) {
        return quantities[type];
    }

    public Integer getSalesProceeds() {
        return salesProceeds;
    }
}
