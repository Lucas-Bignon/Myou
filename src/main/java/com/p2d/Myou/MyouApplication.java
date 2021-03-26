package com.p2d.Myou;

import com.p2d.Myou.controller.IInvoiceController;
import com.p2d.Myou.model.Invoice;
import com.p2d.Myou.repository.IInvoiceRepository;
import com.p2d.Myou.service.IInvoiceService;
import com.p2d.Myou.service.prefix.PrefixInvoiceService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.p2d.Myou.controller.Keyboard","com.p2d.Myou.repository.database","com.p2d.Myou.service.number"})
public class MyouApplication {
	public static void main(String[] args) {

		//SpringApplication.run(MyouApplication.class, args);
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MyouApplication.class);
		IInvoiceController invoiceController = context.getBean(IInvoiceController.class);
		invoiceController.createInvoice();
	}

	@Bean
	public IInvoiceService configureServiceInterface(){
		return new PrefixInvoiceService();
	}

}
