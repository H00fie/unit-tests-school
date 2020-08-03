package bm.app.moduleTwo;

import java.math.BigDecimal;
import java.math.MathContext;

public class VatService {

    VatProvider vatProvider;

    public VatService(VatProvider vatProvider) {
        this.vatProvider = vatProvider;
    }

    public BigDecimal getGrossPriceForDefaultVat(Product product) throws IncorrectVatException {
        return calculateGrossPrice(product.getNetPrice(), vatProvider.getDefaultVat());
    }

    public BigDecimal getGrossPrice(BigDecimal netPrice, String productType) throws IncorrectVatException {
        BigDecimal vatValue = vatProvider.getVatForType(productType);
        return calculateGrossPrice(netPrice, vatValue);
    }

    private BigDecimal calculateGrossPrice(BigDecimal netPrice, BigDecimal vatValue) throws IncorrectVatException{
        MathContext precision = new MathContext(4);
        if (vatValue.compareTo(BigDecimal.ONE) == 1){
            throw new IncorrectVatException("VAT cannot be higher than 100% of the base price.");
        }
        return netPrice.multiply(BigDecimal.ONE.add(vatValue)).round(precision);
    }
}
