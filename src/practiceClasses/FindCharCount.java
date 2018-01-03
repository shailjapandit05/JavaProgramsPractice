package practiceClasses;

import java.util.HashSet;
import java.util.Set;

public class FindCharCount {

	static String[] s={"a","b","c","a","d","b","e","f","g","d","e","f","a","a","f","x","z","d","g","c","a","x","y"};
	public static void main (String []args){
		Set<String> stringSet = new HashSet<String>();
		for(String abc:s){
			stringSet.add(abc);
		}

		for(String val:stringSet){
			int count = 0;
			for(int i=0; i<s.length; i++) {
				if(val.equals(s[i]))
					++count;
			}
			System.out.println("["+val+"] exists for = "+count+" times");
		}

	}

}
