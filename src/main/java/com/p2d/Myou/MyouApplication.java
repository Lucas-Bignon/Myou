package com.p2d.Myou;

import com.p2d.Myou.controller.IInvoiceController;
import com.p2d.Myou.controller.KeyboardInvoiceController;
import com.p2d.Myou.repository.IInvoiceRepository;
import com.p2d.Myou.repository.DatabaseInvoiceRepository;
import com.p2d.Myou.repository.MemoryInvoiceRepository;
import com.p2d.Myou.service.IInvoiceService;
import com.p2d.Myou.service.NumberInvoiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class MyouApplication {
	public static void main(String[] args) {

		//SpringApplication.run(MyouApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IInvoiceController invoiceController = context.getBean(IInvoiceController.class);
		invoiceController.createInvoice();
	}

}
