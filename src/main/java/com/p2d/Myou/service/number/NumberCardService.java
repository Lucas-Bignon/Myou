package com.p2d.Myou.service.number;
import com.p2d.Myou.model.Card;
import com.p2d.Myou.repository.ICardRepository;
import com.p2d.Myou.service.ICardService;

import java.util.List;


public class NumberCardService implements ICardService {

    public static long lastNumber = 1L;

    private ICardRepository invoiceRepository;

   public ICardRepository getInvoiceRepository(){
       return invoiceRepository;
   }

   public void setInvoiceRepository(ICardRepository invoiceRepository){
       this.invoiceRepository= invoiceRepository;
   }

    public void createInvoice(Card card){
        card.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(card);
    }

    public List<Card> getInvoiceList() {

       return invoiceRepository.list();
    }

    @Override
    public Card getInvoiceByNumber(String number) {
       throw new UnsupportedOperationException();
    }
}
