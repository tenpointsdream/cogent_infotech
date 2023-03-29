package pkg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
	private List<String> names = new ArrayList<>();

	public void setNames(String name) {
		names.add(name);
	}

	public void searchName(String name) {
		if (names.contains(name))
			System.out.println(name + " exists in the list!");
		else
			System.out.println(name + " doesn't exist in the list!");

	}

	public void searchName(int index) {
		if (index > names.size() - 1 || index < 0) {
			System.out.println("Not a valid index");
			return;
		}
		System.out.println("Element [" + index + "]: " + names.get(index));
	}

	public void printNames() {
		System.out.println("Names in the list: ");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}

	public void removeName(String stuName) {
		if (!names.contains(stuName))
			System.out.printf("No \"%s\" in the list\n", stuName);
		else
			names.remove(stuName);
	}
}
