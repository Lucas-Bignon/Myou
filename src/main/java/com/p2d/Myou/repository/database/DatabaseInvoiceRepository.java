package com.p2d.Myou.repository.database;

import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


//@Repository
public class DatabaseInvoiceRepository implements IInvoiceRepository
{
    public void create(Invoice invoice) {
        System.out.println("La facture a été enrengistré avec le nombre " + invoice.getNumber() + " pour " + invoice.getCustomerName() + " en base de donné");
    }

    @Override
    public List<Invoice> list(){
        throw new UnsupportedOperationException();
    }

    @Override
    public Invoice getById(String number) {
        throw new UnsupportedOperationException();
    }
}
