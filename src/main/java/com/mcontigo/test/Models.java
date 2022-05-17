package com.mcontigo.test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

class BTCPrice {
    private BigDecimal price;
    private LocalDateTime lastUpdate;
    private FiatType fiatType;
}

enum FiatType {
    USD, GBP, EUR
}
