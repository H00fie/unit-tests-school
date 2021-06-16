package bm.app.moduleTwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.MathContext;

public class VatService {

    Logger logger = LoggerFactory.getLogger(VatService.class);

    VatProvider vatProvider;

    public VatService(VatProvider vatProvider) {
        this.vatProvider = vatProvider;
    }

    public VatService() {

    }

    public BigDecimal getGrossPriceForDefaultVat(Product product) throws IncorrectVatException {
        logger.info("Called getGrossPriceForDefaultVat, product: " + product.getType() +
                ", net price: " + product.getNetPrice() +
                ", VAT: " + vatProvider.getDefaultVat());
        return calculateGrossPrice(product.getNetPrice(), vatProvider.getDefaultVat());
        }

    public BigDecimal getGrossPrice(BigDecimal netPrice, String productType) throws IncorrectVatException {
        logger.info("Called getGrossPrice, product: " + productType +
                ", net price: " + netPrice + ", VAT value: " +
                vatProvider.getVatForType(productType));
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
