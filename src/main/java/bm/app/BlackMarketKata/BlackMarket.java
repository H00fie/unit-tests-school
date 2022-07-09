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

    public BigDecimal calculateThePriceWithExtortion(Contraband contraband, int number) throws RidiculousExtortionException {
        return calculateFullCost(contraband.getPrice(), extortion.getExtortion(), number);
    }

    public BigDecimal calculateThePriceWithExtortionForAType(Contraband contraband, int number) throws RidiculousExtortionException {
        BigDecimal extortionAmount = extortion.getExtortionForType(contraband.getType());
        return calculateFullCost(contraband.getPrice(), extortionAmount, number);
    }

    private BigDecimal calculateFullCost(BigDecimal netPrice, BigDecimal extortionPercent, int number) throws RidiculousExtortionException {
        MathContext precision = new MathContext(4);
        if (extortionPercent.compareTo(BigDecimal.ONE) > 0) {
            throw new RidiculousExtortionException("The boss forbids the extortion to exceed 100% value of the base product.");
        }
        return netPrice.multiply(BigDecimal.ONE.add(extortionPercent)).round(precision).multiply(BigDecimal.valueOf(number));
    }

}
