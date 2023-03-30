package pkg.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Tech", "Cogent", "Info", "Tainment", "Sound", "System");
		Predicate<String> p = (s)->s.startsWith("S");
		for (String string : names) {
			if (p.test(string))
				System.out.println(string);
		}
	}
}
