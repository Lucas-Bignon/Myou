package com.p2d.Myou.repository;

import com.p2d.Myou.model.Invoice;

import java.util.ArrayList;
import java.util.List;

public class DatabaseInvoiceRepository implements IInvoiceRepository
{
    public void create(Invoice invoice) {
        System.out.println("La facture a été enrengistré avec le nombre " + invoice.getNumber() + " pour " + invoice.getCustomerName() + " en base de donné");
    }
}
