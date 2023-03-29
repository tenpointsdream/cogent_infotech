package pkg.codingChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

	public static void main(String[] args) {
		List<Object> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		BookDAOImpl bookDAO = new BookDAOImpl();
		int choice = 0;
		int id = 0;
		do {
			System.out.println("*************MENU***************");
			System.out.println("1-Add book");
			System.out.println("2-Print book");
			System.out.println("3-Find book");
			System.out.println("4-Update book");
			System.out.println("5-Delete book");
			System.out.println("6-Exit");
			System.out.println("Please enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				int number = 0;
				int i = 0;
				System.out.println("How many books would you like to add?");
				number = sc.nextInt();
				while (i < number) {
					System.out.println("Enter book ID: ");
					id = sc.nextInt();
					System.out.println("Enter book Name:");
					String name = sc.next();
					System.out.println("Enter book Price: ");
					float price = sc.nextFloat();
					Book b = new Book(id, name, price);
					bookDAO.add(books, b);
					i++;
				}
				break;
			case 2:
				bookDAO.print(books);
				break;
			case 3:
				System.out.println("What is the ID of the book you are looking for? ");
				bookDAO.find(books, sc.nextInt());
				break;
			case 4:
				System.out.println("What is the ID of the book you want to update? ");
				bookDAO.update(books, sc.nextInt());
				break;
			case 5:
				System.out.println("What is the ID of the book you want to delele? ");
				bookDAO.delete(books, sc.nextInt());
				break;
			case 6:
				System.exit(0);
			}
		} while (choice != 6);
		sc.close();
	}
}
