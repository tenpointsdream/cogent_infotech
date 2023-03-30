package week2_0330;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
	Scanner sc = new Scanner(System.in);
	private Map<Integer, String> empName = new HashMap<>();
	
	public void setNames() {
		
		System.out.println("Enter roll number: ");
		int rollNo = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		empName.put(rollNo,  name);
	}
	
	public void printName() {
		Collection<String> values = empName.values();
		System.out.println("All names in the hashmap: ");
		for (String string : values) {
			System.out.println(string);
		}
	}
	
	public void getName(int key) {
		if (!empName.containsKey(key)) {
			System.out.println("No name with key [" + key +"] in the Hashmap!");
			return;
		}
		System.out.println("\nAll key in the Hashmap");
		System.out.println("Key: " + key + "\t-->Name: " + empName.get(key));
	}
	public void printNamesKeySet() {
		System.out.println("\nKeyset of the Hashmap: ");
		Set<Integer> keyset = empName.keySet();
		for (Integer key : keyset) {
			System.out.println("Key: " + key + "\t-->Value: " + empName.get(key));
		}
	}
	
	public void printSize() {
		System.out.println("Hashmap size: " + empName.size());
	}
	
	public void remove(int key) {
		empName.remove(key);
		System.out.println("Removed student with key: " + key);
	}
}
