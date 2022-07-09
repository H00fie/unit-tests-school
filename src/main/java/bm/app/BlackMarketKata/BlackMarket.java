package bm.app.BlackMarketKata;

import java.math.BigDecimal;
import java.math.MathContext;

public class BlackMarket {

    Extortion extortion;

    public BlackMarket(Extortion extortion) {
        this.extortion = extortion;
    }

    public BigDecimal calculateThePriceWithoutExtortion(Contraband contraband, int number) {
        return contraband.getPrice().multiply(BigDecimal.valueOf(number));
    }

    public BigDecimal calculateThePriceWithExtortion(Contraband contraband, int number) {
        return calculateFullCost(contraband.getPrice(), extortion.getExtortion(), number);
    }

    public BigDecimal calculateThePriceWithExtortionForAType(Contraband contraband, int number) {
        BigDecimal extortionAmount = extortion.getExtortionForType(contraband.getType());
        return calculateFullCost(contraband.getPrice(), extortionAmount, number);
    }

    private BigDecimal calculateFullCost(BigDecimal netPrice, BigDecimal extortionPercent, int number) {
        MathContext precision = new MathContext(4);
        return netPrice.multiply(BigDecimal.ONE.add(extortionPercent)).round(precision).multiply(BigDecimal.valueOf(number));
    }

}
