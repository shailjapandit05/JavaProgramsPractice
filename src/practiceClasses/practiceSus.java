package practiceClasses;

public class practiceSus {

	public static void main(String[] args) {
/*Reverse a number*/
		int num=678;
		int remainder;
		int rev=0;
		while(num>0)
		{
		remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;	
		}	
		
		System.out.println(rev);
}
}

/*
rem=8,7,6
rev=876
num=67,6

*/