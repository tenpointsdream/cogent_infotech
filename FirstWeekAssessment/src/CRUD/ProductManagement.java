package CRUD;

import java.util.Scanner;

public class ProductManagement {
	public static void main(String[] args) {
		Product products[] = null;
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("---------MENU----------");
			System.out.println("1-Create Record");
			System.out.println("2-Read Record");
			System.out.println("3-Update Record");
			System.out.println("4-Delete Record");
			System.out.println("5-Exit");
			System.out.println("Please select an option?");
			choice = sc.nextInt();
			ProductDAO productDAO = new ProductDAO();
			switch(choice) {
			case 1:
				System.out.println("How many products would you like to add?");
				products = new Product[sc.nextInt()];
				productDAO.create(products);
				break;
			case 2:
				productDAO.read(products);
				break;
			case 3:
				System.out.println("Enter product ID to update: ");
				productDAO.update(products, sc.nextInt());
				break;
			case 4:
				System.out.println("Enter product ID to delete: ");
				productDAO.delete(products, sc.nextInt());
				break;
			case 5:
				System.exit(0);
			}
		}
		while(choice != 5);
		sc.close();
	}
}
