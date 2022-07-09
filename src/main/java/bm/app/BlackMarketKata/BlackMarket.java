package bm.app.BlackMarketKata;

import java.math.BigDecimal;

public class BlackMarket {

    public BigDecimal calculateThePriceWithoutExtortion(Contraband contraband, int number) {
        return contraband.getPrice().multiply(BigDecimal.valueOf(number));
    }

}
