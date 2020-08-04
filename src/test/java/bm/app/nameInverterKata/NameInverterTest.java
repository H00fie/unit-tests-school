package bm.app.nameInverterKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class NameInverterTest {

    private NameInverter inverter;

    @Test
    void shouldThrowExceptionWhenNullProvided(){
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
           inverter.invert(null);
        });
    }

    @Test
    void shouldReturnAnEmptyStringWhenAnEmptyStringIsProvided(){
        String inverted = inverter.invert("");
        assertThat(inverted).isEqualTo("");
    }

    @BeforeEach
    void setUp(){
        inverter = new NameInverter();
    }

}
