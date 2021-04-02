package com.p2d.Myou.repository.memory;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class MemoryInvoiceRepository implements IInvoiceRepository {

   @Autowired
    private static List<Invoice> invoices= new ArrayList<>();
    public void create(Invoice invoice){
        invoices.add(invoice);
        System.out.println("La facture a été enrengistré avec le nombre "+ invoice.getNumber()+" pour "+invoice.getCustomerName()+" en mémoire");
    }
    public List<Invoice> list(){
        Invoice invoice1 = new Invoice();
        invoice1.setNumber("01");
        invoice1.setCustomerName("EDF");
        Invoice invoice2 = new Invoice();
        invoice2.setNumber("02");
        invoice2.setCustomerName("GDF");
        return List.of(invoice1, invoice2);
    }

    @Override
    public Invoice getById(String number) {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber(number);
        invoice1.setCustomerName("LUCAS");
        invoice1.setOrderNumber("num_002");
        return invoice1;
    }
}
