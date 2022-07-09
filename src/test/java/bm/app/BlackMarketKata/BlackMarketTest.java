package bm.app.BlackMarketKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BlackMarketTest {

    BlackMarket blackMarket;

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

    private Contraband generateAProductWithAPrice(String price, String type) {
        return new Contraband(UUID.randomUUID(), new BigDecimal(price), type);
    }

    @BeforeEach
    void setUp() {
        blackMarket = new BlackMarket();
    }

}