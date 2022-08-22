package bm.app.sapFiModuleKata;

import java.math.BigDecimal;

public class SapFiModule {

    public BigDecimal sumTheAmountOfAllInvoices(Invoice invoice, int number) {
        return invoice.getInvoiceSum().multiply(BigDecimal.valueOf(number));
    }

}
