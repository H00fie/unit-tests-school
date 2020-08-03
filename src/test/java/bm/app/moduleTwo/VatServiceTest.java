package bm.app.moduleTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class VatServiceTest {

    VatService vatService;

    @Test
    @DisplayName("Should calculate the gross price including a default VAT value for a given product.")
    void shouldCalculateGrossPriceForDefaultVat(){
        Product product = generateAProductWithThePrice("100.0");
        assertThat(vatService.getGrossPriceForDefaultVat(product)).isEqualTo("123.0");
    }

    @Test
    @DisplayName("Should calculate the gross price including a provided VAT value for a given product.")
    void shouldCalculateGrossPriceForGivenVatValue(){
        Product product = generateAProductWithThePrice("10.0");
        BigDecimal providedVat = new BigDecimal("0.07");
        assertThat(vatService.getGrossPrice(product.getNetPrice(), providedVat)).isEqualTo("10.70");
    }

    private Product generateAProductWithThePrice(String price){
        return new Product(UUID.randomUUID(), new BigDecimal(price));
    }

    @BeforeEach
    void setUp(){
        vatService = new VatService();
    }


}
