package pkg.collections;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		//al.add(new String("Hello"));
		al.add(50); //auto-boxing
		//al.add(" there");
		
		//For-each loop
		for (Object object: al) {
			String str = object.toString();
			int a = Integer.parseInt(str);
			System.out.println("a: " + a);
		}
		System.out.println(al);
		//Iterator
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al);
		
		itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(al);
		
		List<Integer> list = new ArrayList<>();
		//list = new LinkedList<>();
		
		for (int i = 10; i <= 100; i+=10) {
			list.add(i);
		}
		System.out.println(list);
		list.add(2, 100);
		System.out.println(list);
		list.set(2, 25);
		System.out.println(list);
		List<Integer> a2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a2.add(i);
		}
		System.out.println(a2);
		list.addAll(0, a2);
		System.out.println(list);
		if (list.containsAll(a2)) {
			System.out.println("List contains this list");
		}else {
			System.out.println("List doesn't contain this list");
		}*/
		Student students = new Student();
		students.setNames("Khoa");
		students.setNames("Shovel");
		students.setNames("Bot");
		students.setNames("Empty");
		students.printNames();
		students.searchName("Hello");
		students.searchName(-1);
		students.searchName(4);
		students.searchName(0);
		students.searchName(3);
		students.removeName("Laughter");
		students.removeName("Empty");
		students.printNames();
	}
}
