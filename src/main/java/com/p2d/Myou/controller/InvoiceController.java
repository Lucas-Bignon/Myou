package com.p2d.Myou.controller;

import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.service.IInvoiceService;
import java.util.Scanner;

public class InvoiceController implements IInvoiceController {

    private IInvoiceService invoiceService;
    public void createInvoiceUsingConsole() {
        System.out.println("Salut donne le nom client stp");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }
}
