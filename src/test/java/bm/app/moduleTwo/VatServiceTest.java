package bm.app.moduleTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class VatServiceTest {

    VatService vatService;
    VatProvider vatProvider;

    @Test
    @DisplayName("Should calculate the gross price including a default VAT value for a given product.")
    void shouldCalculateGrossPriceForDefaultVat() throws IncorrectVatException {
        // given
        Product product = generateAProductWithThePrice("100.0", "Dress");
        Mockito.when(vatProvider.getDefaultVat()).thenReturn(new BigDecimal("0.23"));
        // when
        BigDecimal result = vatService.getGrossPriceForDefaultVat(product);
        // then
        assertThat(result).isEqualTo("123.0");
    }

    @Test
    @DisplayName("Should calculate the gross price including a provided VAT value for a given product.")
    void shouldCalculateGrossPriceForGivenVatValue() throws IncorrectVatException {
        // given
        Product product = generateAProductWithThePrice("10.0", "Book");
        Mockito.when(vatProvider.getVatForType(product.getType())).thenReturn(new BigDecimal("0.13"));
        // when
        BigDecimal result = vatService.getGrossPrice(product.getNetPrice(), product.getType());
        // then
        assertThat(result).isEqualTo(new BigDecimal("11.30"));
    }

    @Test
    @DisplayName("Should throw an IncorrectVatException class when provided VAT value is higher than 1.")
    void shouldThrowIncorrectVatExceptionWhenVatValueIsTooHigh() throws IncorrectVatException {
        // given
        Product product = generateAProductWithThePrice("120.0", "SSD Card");
        Mockito.when(vatProvider.getVatForType(product.getType())).thenReturn(BigDecimal.TEN);
        // then
        assertThatExceptionOfType(IncorrectVatException.class).isThrownBy(() -> {
           vatService.getGrossPrice(product.getNetPrice(), product.getType());
        }).withMessage("VAT cannot be higher than 100% of the base price.");
    }

    private Product generateAProductWithThePrice(String price, String type) {
        return new Product(UUID.randomUUID(), new BigDecimal(price), type);
    }

    @BeforeEach
    void setUp() {
        vatProvider = Mockito.mock(VatProvider.class);
        vatService = new VatService(vatProvider);
    }


}
