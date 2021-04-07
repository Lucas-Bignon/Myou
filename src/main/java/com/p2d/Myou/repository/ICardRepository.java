package com.p2d.Myou.repository;
import com.p2d.Myou.model.Card;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ICardRepository {
    void create(Card card);
    List<Card> list();
    Card getById(String number);
}
