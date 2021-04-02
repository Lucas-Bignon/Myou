package com.p2d.Myou.repository;
import com.p2d.Myou.model.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IInvoiceRepository {
    void create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);
}
