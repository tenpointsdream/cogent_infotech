package week2_0330;
//import java.util.*;
import java.util.Iterator;
//import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("Webcam");
		tree.add("Computer");
		tree.add("Webcam");
		tree.add("Monitor");
		tree.add("HDMI cable");
		Iterator<String> itr = tree.iterator();
		while(itr.hasNext()) {
			System.out.println("Product: " + itr.next());
		}
		itr = tree.iterator();
		System.out.println("First element in the TreeSet: " + tree.first());
		//Object last = null;
//		while(itr.hasNext())
//			last = itr.next();
		System.out.println("Last element in the TreeSet: " + tree.last());
		System.out.println("Size of TreeSet: " + tree.size());
		tree.remove("Monitor");
		for (String string : tree) {
			System.out.println("Product: " + string);
		}
		System.out.println("Size of TreeSet: " + tree.size());
	}

}
