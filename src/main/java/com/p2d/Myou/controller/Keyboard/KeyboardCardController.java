package com.p2d.Myou.controller.Keyboard;

import com.p2d.Myou.controller.ICardController;
import com.p2d.Myou.model.Card;
import com.p2d.Myou.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;


//@Controller
public class KeyboardCardController implements ICardController {

    @Autowired
    private ICardService invoiceService;

    public ICardService getInvoiceService(){
        return invoiceService;
    }
    public void setInvoiceService(ICardService invoiceService){
        this.invoiceService = invoiceService;
    }
    public void createInvoice() {
        System.out.println("Salut donne le nom client stp");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Card card = new Card();
        card.setCustomerName(customerName);
        invoiceService.createInvoice(card);
    }
}
