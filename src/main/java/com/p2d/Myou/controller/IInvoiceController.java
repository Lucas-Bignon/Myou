package com.p2d.Myou.controller;

import com.p2d.Myou.service.IInvoiceService;
import org.springframework.stereotype.Controller;


@Controller
public interface IInvoiceController {
    void createInvoice();
    void setInvoiceService(IInvoiceService invoiceService);

}
