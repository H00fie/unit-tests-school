package bm.app.sapFiModuleKata;

import java.math.BigDecimal;
import java.util.UUID;

public class Invoice {

    private BigDecimal invoiceSum;
    private String goodsType;

    public Invoice(BigDecimal invoiceSum, String goodsType) {
        this.invoiceSum = invoiceSum;
        this.goodsType = goodsType;
    }

    public BigDecimal getInvoiceSum() {
        return invoiceSum;
    }

    public String getGoodsType() {
        return goodsType;
    }
}
