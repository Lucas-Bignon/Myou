package com.p2d.Myou.service;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;

public interface IInvoiceService {

    void createInvoice(Invoice invoice);
    void setInvoiceRepository(IInvoiceRepository invoiceRepository);

}
