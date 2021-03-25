package com.p2d.Myou.repository;

import com.p2d.Myou.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {
}
