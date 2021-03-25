package com.p2d.Myou;

import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.service.InvoiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MyouApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyouApplication.class, args);
		System.out.println("Salut donne le nom client stp");
		Scanner sc= new Scanner(System.in);
		String customerName = sc.nextLine();
		Invoice invoice = new Invoice();
		invoice.setCustomerName(customerName);
		InvoiceService invoiceService = new InvoiceService();
		invoiceService.createInvoice(invoice);
	}

}
