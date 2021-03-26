package com.p2d.Myou.repository;
import com.p2d.Myou.model.Invoice;
import org.springframework.stereotype.Repository;


@Repository
public interface IInvoiceRepository {
    void create(Invoice invoice);
}
