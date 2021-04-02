package com.p2d.Myou.controller.Web;
import com.p2d.Myou.controller.IInvoiceController;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Scanner;

@Controller
@RequestMapping("/myou")
public class WebInvoiceController implements IInvoiceController {

    @Autowired
    private IInvoiceService invoiceService;

    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService) {
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

    @RequestMapping("/home")
    public String displayHome(Model model){
        System.out.println("On voit tt les facture");
        model.addAttribute("invoices", invoiceService.getInvoiceList());
        return "invoice-home";
    }
    @RequestMapping("/home/{id}")
    public String displayInvoice(@PathVariable("id") String number, Model model){
        model.addAttribute("invoice", invoiceService.getInvoiceByNumber(number));
        System.out.println("on mate facture par facture");
        return "invoice-details";
    }


}
