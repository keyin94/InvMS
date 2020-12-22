package com.nus.invms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nus.invms.domain.Employee;
import com.nus.invms.domain.Fixset;
import com.nus.invms.domain.Part;
import com.nus.invms.domain.Product;
import com.nus.invms.domain.RoleType;
import com.nus.invms.domain.Status;
import com.nus.invms.domain.Supplier;
import com.nus.invms.repo.EmployeeRepository;
import com.nus.invms.repo.FixsetRepository;
import com.nus.invms.repo.InventoryRepository;
import com.nus.invms.repo.OrderRepository;
import com.nus.invms.repo.PartRepository;
import com.nus.invms.repo.PartUsageRepository;
import com.nus.invms.repo.ProductRepository;
import com.nus.invms.repo.SupplierRepository;

@SpringBootApplication
public class InvMsApplication {

	// test

	// testtt

	@Autowired
	EmployeeRepository erepo;

	@Autowired
	InventoryRepository irepo;

	@Autowired
	OrderRepository orepo;

	@Autowired
	PartUsageRepository purepo;

	@Autowired
	SupplierRepository srepo;

	@Autowired
	ProductRepository prepo;

	@Autowired
	PartRepository partrepo;

	@Autowired
	FixsetRepository fixrepo;

	public static void main(String[] args) {
		SpringApplication.run(InvMsApplication.class, args);

	}

/*	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			
			
			Employee e1 = new Employee("Joe Chen", "joechen", "password", Status.ACTIVE, RoleType.ADMIN); 
			Employee e2 = new Employee("Mechanic", "mechanic", "password", Status.ACTIVE, RoleType.MECHANIC); 
			Employee e3 = new Employee("Admin", "admin", "password", Status.ACTIVE, RoleType.ADMIN); 
			erepo.save(e1);
			erepo.save(e2);
			erepo.save(e3);
			
			Supplier s1 = new Supplier("Spare Part Supplier Company", Status.ACTIVE, "91276332", "1 Heng Mui Keng Terrace", "sparepart@gmail.com");
			srepo.save(s1);
			
			Product p1 = new Product(1, 10, 20, "Sample Product Name", "Sample Description", "Red", "Sample Dimension", "Sample Manufacturer", "Shelf 1A", 23.00, Status.ACTIVE);
			prepo.save(p1);
			
			Inventory i1 = new Inventory(1, "Random Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i2 = new Inventory(2, "King Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i3 = new Inventory(3, "Singa Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i4 = new Inventory(4, "Coco Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i5 = new Inventory(5, "Alan Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i6 = new Inventory(6, "Taka Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i7 = new Inventory(7, "Lee Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i8 = new Inventory(8, "Rocky Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i9 = new Inventory(9, "Metal Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i10 = new Inventory(10, "Caterpillar Brand", "This stock is on special offer", "Car Windows", "Front Windows", "Unbreakable Windows", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i11 = new Inventory(1, "Random Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i12 = new Inventory(2, "King Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i13 = new Inventory(3, "Singa Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i14 = new Inventory(4, "Coco Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i15 = new Inventory(5, "Alan Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i16 = new Inventory(6, "Taka Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i17 = new Inventory(7, "Lee Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i18 = new Inventory(8, "Rocky Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i19 = new Inventory(9, "Metal Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			Inventory i20 = new Inventory(10, "Caterpillar Brand", "This stock is expiring soon", "Car Parts", "Tyres", "Tyres for Rainy Days", 23.00, 35.00, 47.00, 96.00, "Anti Skid Tyre with ultra hard rubber", 35, p1, s1, s1.getSupplierName());
			irepo.save(i1);
			irepo.save(i2);
			irepo.save(i3);
			irepo.save(i4);
			irepo.save(i5);
			irepo.save(i6);
			irepo.save(i7);
			irepo.save(i8);
			irepo.save(i9);
			irepo.save(i10);
			irepo.save(i11);
			irepo.save(i12);
			irepo.save(i13);
			irepo.save(i14);
			irepo.save(i15);
			irepo.save(i16);
			irepo.save(i17);
			irepo.save(i18);
			irepo.save(i19);
			irepo.save(i20);
			
			
				Order o1 = new Order()
				
			PartUsage pu1 = new PartUsage(e1, p1.getPartNumber(), 2, LocalDate.now(), "SDV1234R");
				
			purepo.save(pu1);

			System.out.println("Team Alpha Bean - Ready to Run!");

	}*/

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			// System.out.println("Let's start to see our models! ");

			
/*			 * Employee e1 = new Employee();
			 * 
			 * Inventory i1 = new Inventory();
			 * 
			 * Order o1 = new Order();
			 * 
			 * PartUsage pu1 = new PartUsage();
			 * 
			 * Supplier s1 = new Supplier();
			 * 
			 * Product p1 = new Product();
			 * 
			 * 
			 * erepo.save(e1); irepo.save(i1); orepo.save(o1); purepo.save(pu1);
			 * srepo.save(s1); prepo.save(p1);
			 */

			 Employee e1 = new Employee("Elo", "qwerty", "qwerty", Status.ACTIVE, RoleType.ADMIN);
			 Employee e2 = new Employee("Elmo", "asdfgh", "asdfgh", Status.INACTIVE, RoleType.MECHANIC);
			 erepo.save(e1);
			 erepo.save(e2);
			 
			 Supplier s1 = new Supplier("Nestle", Status.ACTIVE, "91134512", "Pasir Ris", "style@mail.com");
			 Supplier s2 = new Supplier("Gogo", Status.ACTIVE, "92323890", "Jurong", "se@mail.com");
			 srepo.save(s1);
			 srepo.save(s2);
			
			
//			
			
			 Product prod1 = new Product (1001, 12, 12, "tyre", "car tyre", "black", "20cm", "dunlop", "bottom", 120.0, Status.ACTIVE);
			 Product prod2 = new Product (1002, 2, 2, "jockey tool", "jockey tool for car repair", "silver", "20cm", "mytool", "office", 20.0, Status.ACTIVE);
			 Product prod3 = new Product (1003, 5, 5, "grease", "car grease", "black", "1 litre", "greeeeease", "top", 12.50, Status.ACTIVE);
			 Product prod4 = new Product (1004, 1, 1,"motor engine", "motor engine replacement", "silver", "12kg", "engine centre", "middle", 70.0, Status.ACTIVE); 
			 prepo.save(prod1);
			 prepo.save(prod2);
			 prepo.save(prod3);   
			 prepo.save(prod4);
			  
			 Part p1 = new Part (prod1, 4);
			 partrepo.save(p1);
			 Part p2 = new Part (prod2, 1);
			 partrepo.save(p2);
			 Part p3 = new Part (prod3, 2);
			 partrepo.save(p3);
			 Part p4 = new Part (prod4, 1);
			 partrepo.save(p4);
			  
			 Fixset fixset1 = new Fixset();
			 fixset1.getPart().add(p1);
			 fixset1.getPart().add(p2);
			 fixset1.setFixsetName("Car Retyre");
			 fixset1.setFixsetDescription("retyre car");
			 fixrepo.save(fixset1);
			              
			              
			 Fixset fixset2 = new Fixset();
			 fixset2.getPart().add(p3);
			 fixset2.getPart().add(p4);
			 fixset2.setFixsetName("Motor Maintenance");
			 fixset2.setFixsetDescription("check and maintain motor");
			              
			 fixrepo.save(fixset2);
			              
			              
			 Fixset fixset3 = new Fixset(); fixset3.getPart().add(p1);
			 fixset3.getPart().add(p3);
			 fixset3.setFixsetName("Car Maintenance");
			 fixset3.setFixsetDescription("check and maintain car");
			              
			 fixrepo.save(fixset3);
			 
			 
			 
			 

		};
	}
}


