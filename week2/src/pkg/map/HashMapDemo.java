package pkg.map;

import java.util.Collection;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Khoa", 24);
		map.put("Tom", 124);
		map.put("Jerry", 120);
		map.put("Shovel", 18);
		System.out.println("Map: " + map);
		Set<String> keyset = map.keySet();
		System.out.println("Key set: " + keyset);
		Collection<Integer> values = map.values();
		System.out.println("Values: " + values);
		for (String key: keyset) {
			System.out.println("Key: " + key + " \t-->Value: " + map.get(key));
		}
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(23, "EA");
		map2.put(100, "DB");
		map2.put(232, "AC");
		map2.put(34, "BE");
		System.out.println("Map 2: " + map2);
		Set<Integer> keyset2 = map2.keySet();
		System.out.println("Key set 2: " + keyset2);
		Collection<String> values2 = map2.values();
		System.out.println("Values 2: " + values2);
		
		for (Integer key: keyset2) {
			System.out.println("Key 2: " + key + "\t-->Value 2: " + map2.get(key));
		}
	}
}
