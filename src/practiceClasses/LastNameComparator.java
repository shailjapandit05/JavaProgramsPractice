package practiceClasses;

import java.util.Comparator;


public	class LastNameComparator implements Comparator<Person> {
	    @Override
	    public int compare(Person a, Person b) {
	        return a.lastName.compareToIgnoreCase(b.lastName);
	    }
	}

