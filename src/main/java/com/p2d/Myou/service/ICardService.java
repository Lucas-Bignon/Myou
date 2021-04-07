package com.p2d.Myou.service;
import com.p2d.Myou.model.Card;
import com.p2d.Myou.repository.ICardRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ICardService {

    void createInvoice(Card card);
    void setInvoiceRepository(ICardRepository invoiceRepository);
    List<Card> getInvoiceList();
    Card getInvoiceByNumber(String number);

}
