package sorting;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		String s1 = o1.name;
		String s2 = o2.name;
		return s1.compareTo(s2);
	}

}
