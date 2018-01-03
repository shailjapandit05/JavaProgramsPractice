package practiceClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnLambda {

	 public static void main(String[] args) {
	 
	 List<Person> people = Arrays.asList(
	 new Person("Swati", "Kumari", 20),
	 new Person("Vijeta", "Juneja", 20),
	 new Person("Deepak", "Thorecha", 20),
	 new Person("Priya", "Patekar", 20),
	 new Person("Akash", "Kumar", 20),
	 new Person("Shailja", "Pandit", 20),
	 new Person("Akshay", "Sartabe", 20),
	 new Person("Abhijeet", "Vaikar", 20),
	 new Person("Shweta", "Phadtare", 20),
	 new Person("Rajat", "Singh", 20),
	 new Person("Ashok", "Surendran", 20),
	 new Person("Minal", "Agarwal", 20)
	 );
	 
	 /*TC1: Sort list by lastname*/	
	 Collections.sort( people, new LastNameComparator());
	 
	 for (Person person : people) {
		 
		 System.out.println(person);
	}
 
	 /*TC2: Print list of people with lastName beginning with 'P'*/
	for (Person person : people) {
		if(person.lastName.startsWith("P")){
			System.out.println(person);
		}
		
	}
	 
	 
	 /*TC3: Print list of people with firstName beginning with 'S'*/
	 class FirstNameComparator implements Comparator<Person> {
		    @Override
		    public int compare(Person a, Person b) {
		        return a.firstName.compareToIgnoreCase(b.firstName);
		    }
		}
	 
	 class AgeComparator implements Comparator<Person> {
		    @Override
		    public int compare(Person a, Person b) {
		        return a.age < b.age ? -1 : a.age == b.age ? 0 : 1;
		    }
		}
	 }}
