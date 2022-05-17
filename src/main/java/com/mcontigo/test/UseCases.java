package com.mcontigo.test;

import java.util.List;

/*
 Here you can put all the business logic
 */
public interface UseCases {
    public List<BTCPrice> fetchAll();
    public BTCPrice fetchBtcPriceByFiat(FiatType type);
    public void syncBtcPrice();
}
