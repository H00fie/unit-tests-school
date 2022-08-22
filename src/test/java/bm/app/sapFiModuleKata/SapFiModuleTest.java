package bm.app.sapFiModuleKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class SapFiModuleTest {

    SapFiModule sapFiModule;

    @Test
    void shouldCalculateTheSumFromAllInvoices() {
        //given
        Invoice invoice = new Invoice(new BigDecimal("45"), "Plushie");
        int numberOfInvoices = 3;
        BigDecimal expectedPrice = new BigDecimal("135");
        //when
        BigDecimal actualPrice = sapFiModule.sumTheAmountOfAllInvoices(invoice, numberOfInvoices);
        //then
        assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @BeforeEach
    void setUp() {
        sapFiModule = new SapFiModule();
    }

}