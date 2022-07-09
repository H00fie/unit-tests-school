package bm.app.BlackMarketKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class BlackMarketTest {

    BlackMarket blackMarket;
    Extortion extortion;

    @Test
    void shouldCalculateThePriceOfFourRifles() {
        //given
        Contraband contraband = generateAProductWithAPrice("150", "Rifle");
        int numberOfGoods = 4;
        BigDecimal expectedPrice = new BigDecimal("600");
        //when
        BigDecimal actualPrice = blackMarket.calculateThePriceWithoutExtortion(contraband, numberOfGoods);
        //then
        assertThat(expectedPrice).isEqualTo(actualPrice);
    }

    @Test
    void shouldCalculateThePriceWithProvidedExtortion() throws RidiculousExtortionException {
        //given
        Contraband contraband = generateAProductWithAPrice("89", "Light drug");
        int numberOfGoods = 7;
        Mockito.when(extortion.getExtortion()).thenReturn(new BigDecimal("0.40"));
        BigDecimal expectedPrice = new BigDecimal("872.2");
        //when
        BigDecimal actualPrice = blackMarket.calculateThePriceWithExtortion(contraband, numberOfGoods);
        //then
        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void shouldCalculateThePriceWithExtortionForParticularType() throws RidiculousExtortionException {
        //given
        Contraband contraband = generateAProductWithAPrice("139", "Heavy drug");
        int numberOfGoods = 3;
        Mockito.when(extortion.getExtortionForType(contraband.getType())).thenReturn(new BigDecimal("0.69"));
        BigDecimal expectedPrice = new BigDecimal("704.7");
        //when
        BigDecimal actualPrice = blackMarket.calculateThePriceWithExtortionForAType(contraband, numberOfGoods);
        //then
        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    void shouldThrowRidiculousExtortionException() {
        //given
        Contraband contraband = generateAProductWithAPrice("50", "Plushies");
        int number = 4;
        Mockito.when(extortion.getExtortion()).thenReturn(new BigDecimal("101"));
        //then
        assertThatExceptionOfType(RidiculousExtortionException.class).isThrownBy(() -> {
            blackMarket.calculateThePriceWithExtortion(contraband, number);
        }).withMessage("The boss forbids the extortion to exceed 100% value of the base product.");
    }

    private Contraband generateAProductWithAPrice(String price, String type) {
        return new Contraband(UUID.randomUUID(), new BigDecimal(price), type);
    }

    @BeforeEach
    void setUp() {
        extortion = Mockito.mock(Extortion.class);
        blackMarket = new BlackMarket(extortion);
    }

}