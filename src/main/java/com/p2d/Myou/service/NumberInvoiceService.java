package com.p2d.Myou.service;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;

public class NumberInvoiceService implements IInvoiceService{

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
}
