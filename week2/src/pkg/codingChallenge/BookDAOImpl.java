package pkg.codingChallenge;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookDAOImpl implements BookDAO {
	Scanner sc = new Scanner(System.in);

	@Override
	public void add(List<Object> books, Object book) {
		books.add(book);
	}

	@Override
	public void print(List<Object> books) {
		if (books.size() == 0) {
			System.out.println("No book in the list!");
			return;
		}
		Iterator<Object> itr = books.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			System.out.println();
			System.out.println("Book ID: " + b.getBookId());
			System.out.println("Book Name: " + b.getBookName());
			System.out.println("Book Price: $" + b.getBookPrice());
		}
	}

	@Override
	public void find(List<Object> books, int id) {
		if (books.size() == 0) {
			System.out.println("No book in the list!");
			return;
		}
		boolean found = false;
		Iterator<Object> itr = books.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			if (b.getBookId() == id) {
				found = true;
				System.out.println("Found book with id: " + id);
				System.out.println("Book Name: " + b.getBookName());
				System.out.println("Book Price: $" + b.getBookPrice());
			}
		}
		if (!found)
			System.out.println("No book with ID [" + id + "] found");
	}

	@Override
	public void update(List<Object> books, int id) {
		if (books.size() == 0) {
			System.out.println("No book in the list!");
			return;
		}
		int choice = 0;
		boolean found = false;
		Iterator<Object> itr = books.iterator();
		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			if (b.getBookId() == id) {
				do {
					found = true;
					System.out.println("1-Update name");
					System.out.println("2-Update price");
					System.out.println("3-Exit updating");
					System.out.println("Which option would you like?");
					switch (choice = sc.nextInt()) {
					case 1:
						System.out.println("Enter new name: ");
						b.setBookName(sc.next());
						break;
					case 2:
						System.out.println("Enter new price: ");
						b.setBookPrice(sc.nextFloat());
						break;
					case 3:
						break;
					}
				} while (choice != 3);
			}
		}
		if (!found)
			System.out.println("No book with ID [" + id + "] found");
	}

	@Override
	public void delete(List<Object> books, int id) {
		if (books.size() == 0) {
			System.out.println("No book in the list!");
			return;
		}
		boolean found = false;
		int i;
		for (i = 0; i < books.size(); i++) {
			Book b = (Book) books.get(i);
			if (b.getBookId() == id) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No book with ID [" + id + "] found");
			return;
		}
		System.out.println("Are you sure? (yes/no)");
		if (sc.next().equals("yes")) {
			books.remove(i);
			System.out.println("Book with ID [" + id + "] is removed!");
		} else {
			System.out.println("Exiting deleting book!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
