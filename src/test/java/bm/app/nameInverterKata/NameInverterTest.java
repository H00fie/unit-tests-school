package bm.app.nameInverterKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class NameInverterTest {

    private NameInverter inverter;
    private static final String EMPTY_STRING = "";

    @Test
    void shouldThrowExceptionWhenNullProvided(){
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
           inverter.invert(null);
        });
    }

    @Test
    void shouldReturnAnEmptyStringWhenAnEmptyStringIsProvided(){
        String inverted = inverter.invert("");
        assertThat(inverted).isEqualTo(EMPTY_STRING);
    }

    @Test
    void shouldReturnAnEmptyStringWhenSpacesAreGiven(){
        String inverted = inverter.invert("   ");
        assertThat(inverted).isEqualTo(EMPTY_STRING);
    }

    @BeforeEach
    void setUp(){
        inverter = new NameInverter();
    }

}
