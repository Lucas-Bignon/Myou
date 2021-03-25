package com.p2d.Myou;

import com.p2d.Myou.controller.InvoiceController;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.service.InvoiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MyouApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyouApplication.class, args);
		InvoiceController invoiceController = new InvoiceController();
		invoiceController.createInvoiceUsingConsole();
	}

}
