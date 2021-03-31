package com.p2d.Myou.controller.Keyboard;

import com.p2d.Myou.controller.IInvoiceController;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;


@Controller
public class KeyboardInvoiceController implements IInvoiceController {

    @Autowired
    private IInvoiceService invoiceService;

    public IInvoiceService getInvoiceService(){
        return invoiceService;
    }
    public void setInvoiceService(IInvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }
    public void createInvoice() {
        System.out.println("Salut donne le nom client stp");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }
}
