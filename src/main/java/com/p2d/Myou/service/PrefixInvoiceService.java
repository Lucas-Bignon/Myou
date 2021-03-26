package com.p2d.Myou.service;

import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;
import org.springframework.beans.factory.annotation.Value;

public class PrefixInvoiceService implements IInvoiceService {

    private IInvoiceRepository invoiceRepository;

    @Override
    public void setInvoiceRepository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    @Value("${invoice.lastNumber}")
    private long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    public IInvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRespository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(prefix + (++lastNumber));
        invoiceRepository.create(invoice);
    }


}
