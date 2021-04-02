package com.p2d.Myou.service.number;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;
import com.p2d.Myou.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class NumberInvoiceService implements IInvoiceService {

    public static long lastNumber = 1L;

    private IInvoiceRepository invoiceRepository;

   public IInvoiceRepository getInvoiceRepository(){
       return invoiceRepository;
   }

   public void setInvoiceRepository(IInvoiceRepository invoiceRepository){
       this.invoiceRepository= invoiceRepository;
   }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }

    public List<Invoice> getInvoiceList() {

       return invoiceRepository.list();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
       throw new UnsupportedOperationException();
    }
}
