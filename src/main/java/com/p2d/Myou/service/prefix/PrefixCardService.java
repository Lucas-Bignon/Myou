package com.p2d.Myou.service.prefix;

import com.p2d.Myou.model.Card;
import com.p2d.Myou.repository.ICardRepository;
import com.p2d.Myou.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefixCardService implements ICardService {

    @Autowired
    private ICardRepository invoiceRepository;

    public void setInvoiceRepository(ICardRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    @Value("${invoice.lastNumber}")
    private long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    public ICardRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRespository(ICardRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Card card) {
        card.setNumber(prefix + (++lastNumber));
        invoiceRepository.create(card);
    }

    public List<Card> getInvoiceList() {

        return invoiceRepository.list();
    }

    @Override
    public Card getInvoiceByNumber(String number) {
        return invoiceRepository.getById(number);
    }
}
