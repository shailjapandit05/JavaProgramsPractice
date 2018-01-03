package practiceClasses;

import java.util.HashSet;
import java.util.Set;

public class RecursiveCharacter {
	public static void main(String[] args) {

		String s="ABBABA";
		Set<Character> mySet = new HashSet<>();
		for (char ch : s.toCharArray()) {
			if(mySet.contains(ch)){
				System.out.println(ch);
				break;
			}
			else
				mySet.add(ch);
		}
	}
}
