package com.p2d.Myou.controller;

import com.p2d.Myou.service.ICardService;


//@Controller
public interface ICardController {
    void createInvoice();
    void setInvoiceService(ICardService invoiceService);

}
