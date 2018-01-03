package practiceClasses;

import java.util.HashSet;
import java.util.Set;

public class FindNumCount {

	public static void main(String[] args) {

		int[] a={1,2,4,5,3,4,2,4,1,5,8,2,4};
		Set<Integer> s=new HashSet<Integer>();
		for (Integer num : a) {
			s.add(num);
		}
		for (Integer integer : s) {
			int count=0;
			for(int i=0;i<a.length;i++ ){
				if(integer.equals(a[i]))
					++count;
			}
			System.out.println(integer+"-"+count);
		}
	}
}
