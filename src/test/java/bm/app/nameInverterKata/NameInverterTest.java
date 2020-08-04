package bm.app.nameInverterKata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class NameInverterTest {

    NameInverter inverter = new NameInverter();

    @Test
    void shouldThrowExceptionWhenNullProvided(){
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
           inverter.invert(null);
        });
    }

}
