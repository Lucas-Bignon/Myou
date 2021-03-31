package com.p2d.Myou;

import com.p2d.Myou.controller.IInvoiceController;
import com.p2d.Myou.service.IInvoiceService;
import com.p2d.Myou.service.prefix.PrefixInvoiceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Myou {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Myou.class, args);
		//SpringApplication.run(Myou.class, args);
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext(Myou.class);
		IInvoiceController invoiceController = context.getBean(IInvoiceController.class);
		invoiceController.createInvoice();
	}
}
