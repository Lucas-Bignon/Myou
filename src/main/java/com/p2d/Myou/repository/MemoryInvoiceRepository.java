package com.p2d.Myou.repository;
import com.p2d.Myou.model.Invoice;
import java.util.ArrayList;
import java.util.List;

public class MemoryInvoiceRepository implements IInvoiceRepository{
    private static List<Invoice> invoices= new ArrayList<>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("La facture a été enrengistré avec le nombre "+ invoice.getNumber()+" pour "+invoice.getCustomerName()+" en mémoire");
    }
}
