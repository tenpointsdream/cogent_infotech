package book_sprJdbc.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import book_sprJdbc.book.dao.BookDAO;
import book_sprJdbc.book.dto.Book;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("book_sprJdbc/test/config.xml");
		BookDAO bdao = (BookDAO) ctx.getBean("bookDAO");
		int choice = 0;
		int id = 0;
		do {
			System.out.println("************Book Management System***********");
			System.out.println("1-Create Book");
			System.out.println("2-Find Book");
			System.out.println("3-List all Books");
			System.out.println("4-Update Book");
			System.out.println("5-Delete Book");
			System.out.println("6-Exit");
			System.out.println("Which option would you like?");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("How many books would you like to add?");
				int number = sc.nextInt();
				sc.nextLine();
				int i = 0;
				while (i < number) {
					System.out.println("Enter book ID:");
					id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter book name:");
					String name = sc.nextLine();
					System.out.println("Enter book author:");
					String author = sc.nextLine();
					System.out.println("Enter book price:");
					double price = sc.nextDouble();
					sc.nextLine();
					Book b = new Book(id, name, author, price);
					System.out.println("\n{Row inserted: " + bdao.create(b) + "}\n");
					i++;
				}
				System.out.println("Back to the main menu...\n");
				break;
			case 2:
				System.out.println("Enter book ID:");
				id = sc.nextInt();
				sc.nextLine();
				if (bdao.read(id) == null)
					System.out.println("No books found with provided ID!");
				else {
					Book b = bdao.read(id);
					System.out.println("Book with ID[" + id + "] found:");
					System.out.println("Book name: " + b.getName());
					System.out.println("Book author: " + b.getAuthor());
					System.out.println("Book price: $" + b.getPrice() + "\n");
				}
				System.out.println("Back to the main menu...\n");
				break;
			case 3:
				System.out.println("--List of book(s)--");
				List<Book> books = bdao.read();
				if (books == null) {
					System.out.println("No books in database");
					break;
				}
				for (Book book : books) {
					System.out.println("Book ID:" + book.getId());
					System.out.println("Book name: " + book.getName());
					System.out.println("Book author: " + book.getAuthor());
					System.out.println("Book price: $" + book.getPrice() + "\n");
				}
				break;
			case 4:
				System.out.println("Enter book ID to update:");
				id = sc.nextInt();
				sc.nextLine();
				if (bdao.read(id) == null)
					System.out.println("No book found with provided ID!");
				else {
					System.out.println("Enter new book name:");
					String name = sc.nextLine();
					System.out.println("Enter new book author:");
					String author = sc.nextLine();
					System.out.println("Enter new book price:");
					double price = sc.nextDouble();
					sc.nextLine();
					Book b = new Book(id, name, author, price);
					System.out.println("{Row(s) updated:" + bdao.update(b) + "}\n");
				}
				System.out.println("Back to the main menu...\n");
				break;
			case 5:

				System.out.println("Enter book ID to update:");
				id = sc.nextInt();
				sc.nextLine();
				if (bdao.read(id) == null)
					System.out.println("No book found with provided ID!");
				else {
					System.out.println("Are you sure to delete the book(s)? (yes/no)");
					String decision = sc.next();
					if (decision.equals("yes"))
						System.out.println("{Row deleted: " + bdao.delete(id) + "}\n");
				}
				System.out.println("Back to the main menu...\n");

				break;
			case 6:
				System.out.println("Goodbye for now...");
				break;
			}
		} while (choice != 6);

	}
}
