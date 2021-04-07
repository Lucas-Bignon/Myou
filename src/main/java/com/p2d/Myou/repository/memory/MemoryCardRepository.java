package com.p2d.Myou.repository.memory;
import com.p2d.Myou.model.Card;
import com.p2d.Myou.repository.ICardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class MemoryCardRepository implements ICardRepository {

   @Autowired
    private static List<Card> cards = new ArrayList<>();
    public void create(Card card){
        cards.add(card);
        System.out.println("La facture a été enrengistré avec le nombre "+ card.getNumber()+" pour "+ card.getCustomerName()+" en mémoire");
    }
    public List<Card> list(){
        Card card1 = new Card();
        card1.setNumber("01");
        card1.setCustomerName("EDF");
        Card card2 = new Card();
        card2.setNumber("02");
        card2.setCustomerName("GDF");
        return List.of(card1, card2);
    }

    @Override
    public Card getById(String number) {
        Card card1 = new Card();
        card1.setNumber(number);
        card1.setCustomerName("LUCAS");
        card1.setOrderNumber("num_002");
        return card1;
    }
}
