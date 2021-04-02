package com.p2d.Myou.service;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IInvoiceService {

    void createInvoice(Invoice invoice);
    void setInvoiceRepository(IInvoiceRepository invoiceRepository);
    List<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);

}
