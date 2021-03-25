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

import java.util.Scanner;

@SpringBootApplication
public class MyouApplication {
	public static void main(String[] args) {

		//SpringApplication.run(MyouApplication.class, args);

		//J'uttilise un scanneur pour choisir mon type de configuration
		Scanner sc= new Scanner(System.in);

		// j'instancie les interfaces
		IInvoiceController invoiceController;
		IInvoiceRepository invoiceRepository=null;
		IInvoiceService invoiceService;


		// je leur dis qu'il sont nouveau
		invoiceController = new KeyboardInvoiceController();
		// je souhaite choisir une configuration en base de donné ou en mémoire
		// Je lance mon scanneur
		System.out.println("Tu préfère bosser en mémoire ou en base de donné ? (memory/database)");
		String repositoryType = sc.nextLine();

		switch (repositoryType){
			case "database":
				invoiceRepository = new DatabaseInvoiceRepository();
				break;
			case "memory":
				invoiceRepository = new MemoryInvoiceRepository();
				break;
		}
		invoiceService = new NumberInvoiceService();
		// je peus commencer a m'amuser
		invoiceController.setInvoiceService(invoiceService);
		invoiceService.setInvoiceRepository(invoiceRepository);
		// avec sa j'évite le nullpointer exeption parce que ct la galère
		invoiceController.createInvoice();
	}

}
