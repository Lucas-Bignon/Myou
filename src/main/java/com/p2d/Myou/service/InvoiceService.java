package com.p2d.Myou.service;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;

public class InvoiceService implements IInvoiceService{

    public static long lastNumber = 1L;
    private IInvoiceRepository invoiceRepository;
    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
