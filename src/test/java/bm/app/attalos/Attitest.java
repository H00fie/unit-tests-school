package bm.app.attalos;

import bm.app.moduleTwo.IncorrectVatException;
import bm.app.moduleTwo.Product;
import bm.app.moduleTwo.VatService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class Attitest {

    @Test
    void shouldCalculateGrossPriceForDefaultvat() throws IncorrectVatException {
        //given
        VatService vatService = new VatService();
        //when
        Product product = new Product(UUID.randomUUID(), new BigDecimal("40.00"), "SomeLoL");
        BigDecimal result = vatService.getGrossPriceForDefaultVat(product);
        //then
        assertThat(result).isEqualTo("20.00"

        );
    }
}
