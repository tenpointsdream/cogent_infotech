package CRUD;

import java.util.Scanner;

public class ProductDAO {
	Scanner sc = new Scanner(System.in);
	
	public void create(Product products[]) {
		if (products.length < 1) {
			System.out.println("Cannot create product list with no items!");
			return;
		}
		for (int i = 0; i < products.length; i++) {
			Product p = new Product();
			System.out.println("Enter product ID: ");
			p.setProductId(sc.nextInt());
			System.out.println("Enter product name: ");
			p.setProductName(sc.next());
			System.out.println("Enter product price: ");
			p.setProductPrice(sc.nextFloat());
			products[i] = p;
		}
	}
	public void read(Product products[]) {
		for (Product p: products) {
			if (p == null) {
				System.out.println("[NO PRODUCT INFOMATION]");
				continue;
			}
			else {
				System.out.println("Product ID: " + p.getProductId());
				System.out.println("Product Name: " + p.getProductName());
				System.out.println("Product Price: $" + p.getProductPrice());
				System.out.println();
			}
		}
	}
	public void update(Product products[], int id) {
		if (products.length < 1) {
			System.out.println("NO PRODUCTS IN THE LIST!");
			return;
		}
		int choice = 0;
		boolean found = false;
		for (int i = 0; i < products.length; i++) {
			if (products[i].getProductId() == id) {
				do {
					found = true;
					System.out.println("What would you like to update?");
					System.out.println("1-Product Name\n2-Product Price\n3-Exit Update function");
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Enter new product name: ");
						products[i].setProductName(sc.next());
					}
					else if (choice == 2) {
						System.out.println("Enter new product price: ");
						products[i].setProductPrice(sc.nextFloat());
					}
					else if (choice == 3)
						break;
				}
				while (choice != 3);
			}
		}
		if (!found)
			System.out.println("No product with provided ID found!");
	}
	public void delete(Product products[], int id) {
		if (products.length < 1) {
			System.out.println("NO PRODUCTS IN THE LIST!");
			return;
		}
		boolean found = false;
		for (int i = 0; i < products.length; i++) {
			if (products[i].getProductId() == id) {
				found = true;
				System.out.println("Are you sure? (if Yes, type \"1\")");
				if (sc.nextInt() == 1)
					products[i] = null;
				else
					System.out.println("Exiting Delete function");
					
			}
			else 
				continue;
		}
		if (!found)
			System.out.println("No product with provided ID found!");
	}
}
