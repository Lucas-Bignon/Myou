package com.p2d.Myou.repository.database;

import com.p2d.Myou.model.Card;
import com.p2d.Myou.repository.ICardRepository;

import java.util.List;


//@Repository
public class DatabaseCardRepository implements ICardRepository
{
    public void create(Card card) {
        System.out.println("La facture a été enrengistré avec le nombre " + card.getNumber() + " pour " + card.getCustomerName() + " en base de donné");
    }

    @Override
    public List<Card> list(){
        throw new UnsupportedOperationException();
    }

    @Override
    public Card getById(String number) {
        throw new UnsupportedOperationException();
    }
}
