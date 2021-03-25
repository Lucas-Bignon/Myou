package com.p2d.Myou.controller;

import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.service.IInvoiceService;
import java.util.Scanner;

public class KeyboardInvoiceController implements IInvoiceController {

    public IInvoiceService getInvoiceService(){
        return invoiceService;
    }
    public void setInvoiceService(IInvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }

    private IInvoiceService invoiceService;
    public void createInvoice() {
        System.out.println("Salut donne le nom client stp");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }
}
