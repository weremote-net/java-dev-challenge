package com.mcontigo.test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
/*
 You should implement this interface to interact with persistence
 If you prefer, can use any ORM library
 */
interface RepositoryDB {
    public List<BTCPrice> fetchAll();
    public BTCPrice fetchByFiat(FiatType fiatType);
    public void registerBTCPrice(BigDecimal price, LocalDateTime registerAt);
}


/*
 You should implement this based on coindesk request from https://api.coindesk.com/v1/bpi/currentprice.json
 */
interface RepositoryExternal {
    public List<BTCPrice> fetchCurrentPrice();
}

