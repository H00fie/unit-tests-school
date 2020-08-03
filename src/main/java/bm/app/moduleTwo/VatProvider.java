package bm.app.moduleTwo;

import java.math.BigDecimal;

public interface VatProvider {

    BigDecimal getDefaultVat();
    BigDecimal getVatForType(String type);
}
