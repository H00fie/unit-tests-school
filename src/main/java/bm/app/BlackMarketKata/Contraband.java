package bm.app.BlackMarketKata;

import java.math.BigDecimal;
import java.util.UUID;

public class Contraband {

    private UUID uuid;
    private BigDecimal price;
    private String type;

    public Contraband(UUID uuid, BigDecimal price, String type) {
        this.uuid = uuid;
        this.price = price;
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
